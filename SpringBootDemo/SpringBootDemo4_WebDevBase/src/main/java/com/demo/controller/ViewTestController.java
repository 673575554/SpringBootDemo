package com.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTestController {

    @GetMapping("/baidu")
    public String baidu(Model model){

        //model中的数据会被放在请求域中 request.setAttribute
        model.addAttribute("msg","百度一下");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }
}
