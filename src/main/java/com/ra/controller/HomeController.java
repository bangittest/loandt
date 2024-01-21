package com.ra.controller;

import com.ra.model.entity.Loandt;
import com.ra.model.service.LoandtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private LoandtService loandtService;
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/loandt")
    public String findAll(Model model){
        List<Loandt>list=loandtService.findAll();
        model.addAttribute("list",list);
        return "loandt";
    }
}
