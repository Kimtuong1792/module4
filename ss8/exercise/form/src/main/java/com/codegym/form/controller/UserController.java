package com.codegym.form.controller;

import com.codegym.form.dto.UserDto;
import com.codegym.form.model.User;
import com.codegym.form.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
@Autowired
    IUserService userService;
    @GetMapping("")
    public String home( Model model) {
        model.addAttribute("userList", userService.findAll());
        model.addAttribute("userDto",new UserDto());
        return "index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("user", new UserDto());
        return "create";
    }
    @PostMapping("/validateUser")
    public String checkValidation(@ModelAttribute("user") @Validated UserDto userDto, BindingResult bindingResult,Model model) {
        new UserDto().validate(userDto,bindingResult);

        if (bindingResult.hasFieldErrors()) {
            return "create";
        }else {
            User user= new User();
            BeanUtils.copyProperties(userDto,user);
            userService.save(user);
            model.addAttribute("userList", userService.findAll());
            return "index";
        }
    }

//    @PostMapping("/save")
//    public String save(User user) {
//        userService.save(user);
//        return "redirect:/list";
//    }
}
