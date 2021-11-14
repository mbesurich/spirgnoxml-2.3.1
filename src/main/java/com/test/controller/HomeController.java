package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class HomeController {

    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/welcome")
    public String getWelcome(){
        return "welcome";
    }

    @GetMapping("/folder")
    public String getFolder(){
        return "first/folder";
    }

}
