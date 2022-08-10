package codegym.casestudym4.controller.customer;

import codegym.casestudym4.dto.customer.CustomerDto;
import codegym.casestudym4.model.contract.Contract;
import codegym.casestudym4.model.contract.ContractDetail;
import codegym.casestudym4.model.customer.Customer;
import codegym.casestudym4.service.contract.IContractDetailService;
import codegym.casestudym4.service.contract.IContractService;
import codegym.casestudym4.service.customer.ICustomerService;
import codegym.casestudym4.service.customer.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    ICustomerService customerService;
    @Autowired
    ICustomerTypeService customerTypeService;
    @Autowired
    IContractDetailService contractDetailService;
    @Autowired
    IContractService contractService;


    @GetMapping("/customer")
    public String customerList(@PageableDefault(value = 5) Pageable pageable, Model model) {
        model.addAttribute("customerList", customerService.findAll(pageable));
        return "customer/index";
    }

    @GetMapping("/customer/create")
    public String create(Model model) {
        model.addAttribute("customerDto", new CustomerDto());
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        return "customer/create";
    }

    @PostMapping("/customer/save")
    public String save(@Validated @ModelAttribute("customerDto") CustomerDto customerDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "customer/create";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success", "Add Customer Successful!");
        return "redirect:/customer";
    }
    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("customerDto", customerService.findById(id));
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        return "/customer/edit";
    }
    @PostMapping("/customer/update")
    public String update(@Validated @ModelAttribute("customerDto") CustomerDto customerDto, BindingResult bindingResult, RedirectAttributes redirect , Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customerTypeList", customerTypeService.findAll());
            return "/customer/edit";
        }

        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        customerService.save(customer);
        redirect.addFlashAttribute("success", "Update product successfully!");
        return "redirect:/customer";
    }
    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        return "/customer/delete";
    }
    @PostMapping("/customer/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        Customer customer = customerService.findById(id).get();
        List<Contract> contract = contractService.findByCustomerId(id);
        for (int i=0;i<contract.size();i++){
            List<ContractDetail> contractDetailList = contractDetailService.getContractDetail(contract.get(i).getId());
            for (int j = 0; j < contractDetailList.size(); j++) {
                contractDetailService.remove(contractDetailList.get(j));
            }
            contractService.remove(contract.get(i).getId());
        }
        customerService.remove(id);
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/customer";
    }
}
