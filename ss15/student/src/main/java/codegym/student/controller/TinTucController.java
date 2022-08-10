package codegym.student.controller;

import codegym.student.Dto.TinTucDto;
import codegym.student.model.TinTuc;
import codegym.student.service.ITinTucService;
import codegym.student.service.IDanhMucService;
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
public class TinTucController {
    @Autowired
    ITinTucService tinTucService;
    @Autowired
    IDanhMucService danhMucService;

    @GetMapping("")
    public String customerList(@PageableDefault(value = 5) Pageable pageable, Model model) {
        model.addAttribute("tinTucList", tinTucService.findAll(pageable));
        return "index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("tinTucDto", new TinTucDto());
        model.addAttribute("danhMucList", danhMucService.findAll());
        return "create";
    }

    @PostMapping("/save")
    public String save(@Validated @ModelAttribute("tinTucDto") TinTucDto questionDto, BindingResult bindingResult,
                       RedirectAttributes redirectAttributes , Model model , @PageableDefault(value = 5) Pageable pageable) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("danhMucList", danhMucService.findAll());
            return "create";
        }
        TinTuc question = new TinTuc();
        BeanUtils.copyProperties(questionDto, question);
        tinTucService.save(question);
        redirectAttributes.addFlashAttribute("success", "Add question Successful!");
        model.addAttribute("tinTucList", tinTucService.findAll(pageable));
        return "index";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("tinTuc", tinTucService.findById(id));
        model.addAttribute("danhMucList", danhMucService.findAll());
        return "/delete";
    }
    @PostMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        tinTucService.remove(id);
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:";
    }
    @GetMapping("/search")
    public ModelAndView search(@RequestParam("search") String search,
                               @RequestParam("tieu_de") String titleSearch, Pageable pageable) {
        Page<TinTuc> questions = tinTucService.findByNameContaining(search, titleSearch,pageable);
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("tinTucList", questions);
        return modelAndView;
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("tinTuc", tinTucService.findById(id));
        model.addAttribute("danhMucList", danhMucService.findAll());
        return "view";
    }

}
