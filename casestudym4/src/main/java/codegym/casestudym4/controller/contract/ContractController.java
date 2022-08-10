package codegym.casestudym4.controller.contract;

import codegym.casestudym4.dto.customer.CustomerDto;
import codegym.casestudym4.model.contract.Contract;
import codegym.casestudym4.model.customer.Customer;
import codegym.casestudym4.service.contract.IAttachFacilityService;
import codegym.casestudym4.service.contract.IContractDetailService;
import codegym.casestudym4.service.contract.IContractService;
import codegym.casestudym4.service.customer.ICustomerService;
import codegym.casestudym4.service.facility.IFacilityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ContractController {
    @Autowired
    private IContractService contractService;
    @Autowired
    private IContractDetailService contractDetailService;
    @Autowired
    private IAttachFacilityService attachFacilityService;
    @Autowired
    private IFacilityService facilityService;
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/contract")
    public String customerList(@PageableDefault(value = 5) Pageable pageable, Model model) {
        model.addAttribute("contractList", contractService.findAll(pageable));
        model.addAttribute("attachFacilityList", attachFacilityService.findAll());
        model.addAttribute("contractDetailList", contractDetailService.findAll());
        model.addAttribute("totalMoneyList",contractService.getTotalMoney());

        System.out.println(contractService.getTotalMoney());
        System.out.println(contractService.findAll(pageable));
        return "contract/index";
    }
    @GetMapping("/contract/create")
    public String create(Model model) {
        model.addAttribute("contract", new Contract());
        model.addAttribute("customerList", customerService.findAll());
        model.addAttribute("facilityList" , facilityService.findAll());
        return "contract/create";
    }

    @PostMapping("/contract/save")
    public String save( @ModelAttribute("contract") Contract contract, RedirectAttributes redirectAttributes) {
        contractService.save(contract);
        redirectAttributes.addFlashAttribute("success", "Add Customer Successful!");
        return "redirect:/contract";
    }
}
