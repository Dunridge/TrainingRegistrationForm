package com.max.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {

    /**
     * You'll try to add the request mapping
     * to other elements.
     */
    @RequestMapping("/api")
    public String mainPage() {
        return "index.html";
    }

    @RequestMapping("/form")
    public String regForm() {
        return "reg_form";
    }

    //test
}
