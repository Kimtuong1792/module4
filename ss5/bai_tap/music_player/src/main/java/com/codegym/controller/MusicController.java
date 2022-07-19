package com.codegym.controller;

import com.codegym.model.Music;
import com.codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.PersistenceContext;

@Controller

public class MusicController {
    @Autowired
    IMusicService musicService;

    @GetMapping("")
    public String showMusic(Model model) {
        model.addAttribute("musicList", musicService.findAll());
        return "music";
    }

    @GetMapping("/show-create")
    public String showCreate(Music music, Model model) {
        model.addAttribute("createMusic", new Music());
        return "create";
    }
    @PostMapping("create")
    public String create(Music music, Model model){
      musicService.save(music);
      return "redirect:/";
    }
    @GetMapping("/show-update")
    public String showUpdate(Model model){
      model.addAttribute("updateMusic",)
    }
}
