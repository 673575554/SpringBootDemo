package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormTestController {

    @GetMapping("/form_layoyts")
    public String form_layouts(){

        return "form/form_layouts";
    }

}
