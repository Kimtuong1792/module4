package codegym.product.controller;

import codegym.product.dto.CartDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShoppingCartController {

    @GetMapping("/cart")
    public ModelAndView showCart (@SessionAttribute("cart") CartDto cartDto){
        ModelAndView modelAndView = new ModelAndView("/cart");
        modelAndView.addObject("cart",cartDto);
        return modelAndView;
    }
}
