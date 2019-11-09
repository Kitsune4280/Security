package edu.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String homepage(){
        System.out.println("test");
        return "forward:index";
    }
}
