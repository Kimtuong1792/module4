package codegym.casestudym4.controller.employee;

import codegym.casestudym4.dto.customer.CustomerDto;
import codegym.casestudym4.dto.employee.EmployeeDto;
import codegym.casestudym4.model.customer.Customer;
import codegym.casestudym4.model.employee.Employee;
import codegym.casestudym4.service.employee.IDivisionService;
import codegym.casestudym4.service.employee.IEducationDegreeService;
import codegym.casestudym4.service.employee.IEmployeeService;
import codegym.casestudym4.service.employee.IPositionService;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmployController {
   @Autowired
    IEmployeeService employeeService;
   @Autowired
    IDivisionService divisionService;
   @Autowired
    IEducationDegreeService educationDegreeService;
   @Autowired
    IPositionService positionService;
    @GetMapping("/employee")
    public String customerList(@PageableDefault(value = 2) Pageable pageable, Model model) {
        model.addAttribute("employeeList", employeeService.findAll(pageable));
        return "employee/index";
    }
    @GetMapping("/employee/create")
    public String create(Model model) {
        model.addAttribute("employeeDto", new EmployeeDto());
        model.addAttribute("positionList", positionService.findAll());
        model.addAttribute("divisionList", divisionService.findAll());
        model.addAttribute("educationDegreeList", educationDegreeService.findAll());
        return "employee/create";
    }

    @PostMapping("/employee/save")
    public String save(@Validated @ModelAttribute("employeeDto") EmployeeDto employeeDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "employee/create";
        }
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto, employee);
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("success", "Add Customer Successful!");
        return "redirect:/employee";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("employeeDto", employeeService.findById(id));
        model.addAttribute("positionList", positionService.findAll());
        model.addAttribute("divisionList", divisionService.findAll());
        model.addAttribute("educationDegreeList", educationDegreeService.findAll());
        return "/employee/edit";
    }
    @PostMapping("/employee/update")
    public String update(@Validated @ModelAttribute("employeeDto") EmployeeDto employeeDto, BindingResult bindingResult, RedirectAttributes redirect , Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("positionList", positionService.findAll());
            model.addAttribute("divisionList", divisionService.findAll());
            model.addAttribute("educationDegreeList", educationDegreeService.findAll());
            return "/employee/edit";
        }

        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto, employee);
        employeeService.save(employee);
        redirect.addFlashAttribute("success", "Update product successfully!");
        return "redirect:/employee";
    }
}
