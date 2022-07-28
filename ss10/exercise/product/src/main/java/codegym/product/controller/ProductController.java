package codegym.product.controller;

import codegym.product.dto.CartDto;
import codegym.product.dto.ProductDto;
import codegym.product.model.Product;
import codegym.product.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public CartDto setupCart() {
        return new CartDto();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }

    @GetMapping("shop/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute("cart") CartDto cartDto) {
        Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent()) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(productOptional.get(), productDto);
            cartDto.addProduct(productDto);
        }
        return "redirect:/cart";
    }
    @GetMapping("shop/detail/{id}")
    public ModelAndView showDetail(@PathVariable Long id, HttpServletResponse response) {
        Cookie cookie = new Cookie("idProduct" , id+"");
       cookie.setMaxAge(1*24*60*60);
       cookie.setPath("/");
       response.addCookie(cookie);
        return new ModelAndView("detail","product",productService.findById(id).get());
    }

}
