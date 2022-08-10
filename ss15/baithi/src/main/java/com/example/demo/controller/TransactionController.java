package com.example.demo.controller;

import com.example.demo.dto.TransactionDto;
import com.example.demo.model.Transaction;
import com.example.demo.service.ICustomerService;
import com.example.demo.service.ITransactionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TransactionController {
    @Autowired
    ICustomerService customerService;
    @Autowired
    ITransactionService transactionService;
    @GetMapping("")
    public String customerList(@PageableDefault(value = 5) Pageable pageable, Model model) {
        model.addAttribute("transactionList", transactionService.findAll(pageable));
        return "index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("transactionDto", new TransactionDto());
        model.addAttribute("customerList", customerService.findAll());
        return "/create";
    }

    @PostMapping("/save")
    public String save(@Validated @ModelAttribute("transactionDto") TransactionDto transactionDto, BindingResult bindingResult,
                       RedirectAttributes redirectAttributes , Model model , @PageableDefault(value = 5) Pageable pageable) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customerList", customerService.findAll());
            return "/create";
        }
        Transaction transaction = new Transaction();
        BeanUtils.copyProperties(transactionDto, transaction);
        transactionService.save(transaction);
        redirectAttributes.addFlashAttribute("success", "Add question Successful!");
        model.addAttribute("transactionList", transactionService.findAll(pageable));
        return "redirect:";
    }
    @GetMapping("/search")
    public ModelAndView search(@RequestParam("search") String search,
                               @RequestParam("typeSearch") String typeSearch,Pageable pageable) {
        Page<Transaction> transactions = transactionService.findByNameContaining(search,typeSearch,pageable);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("transactionList", transactions);
        return modelAndView;
    }
    @GetMapping("/{id}/view")
    public String delete(@PathVariable String id, Model model) {
        model.addAttribute("transaction", transactionService.findById(id));
        model.addAttribute("customerList", customerService.findAll());
        return "view";
    }

}
