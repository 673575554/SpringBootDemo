package com.demo.controller;

import com.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;


@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String basic_table(){

        return "/table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model){
        //表格内容的遍历
//        List<User> users = Arrays.asList(new User("zhangsan","123"),
//                new User("lisi","123456"),
//                new User("wangwu","54321"),
//                new User("zhaoliu","123"));
//        model.addAttribute("users",users);

        //从数据库查出user表中的用户进行展示


        return "/table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){

        return "/table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){

        return "/table/editable_table";
    }
}
