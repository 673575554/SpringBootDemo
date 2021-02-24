package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 文件上传控制测试
 */
@Controller
public class FormTestController {

    @GetMapping("/form_layoyts")
    public String form_layouts(){

        return "form_layoyts";
    }

}
