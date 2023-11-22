package com.orzech.chucknorrisjokes.controllers;

import com.orzech.chucknorrisjokes.services.JokeReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeReturnService service;

    @Autowired
    public JokeController(JokeReturnService service) {
        this.service = service;
    }
    @RequestMapping({"/joke","/",""})
    public String getRandomJoke(Model model) {
        model.addAttribute("jokes",service.getJoke());
        return "joke";
    }
}
