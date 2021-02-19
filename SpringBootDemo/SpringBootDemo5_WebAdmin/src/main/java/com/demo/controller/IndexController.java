package com.demo.controller;

import com.demo.bean.User;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    /**
     * 发送GET请求，来到登录页面
     * @return
     */
    @GetMapping({"/","login"})
    public String loginPage(){

        return "login";
    }

    /**
     * 登录之后进入主页
     * @return
     */
    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if (StringUtils.hasLength(user.getUserName()) && "123".equals(user.getPassword())){
            //把登录成功的用户保存
            session.setAttribute("loginUser",user);
            //登录成功后再次提交重定向进入main页面，防止表单重复提交
            return "redirect:/main.html";
        }else {
            //没有登录成功就再回到登录页面
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
    }


    /**
     * 去main页面
     * @return
     */
    @GetMapping("/main.html")
    public String MainPage(HttpSession session,Model model){

        //直接进入main页面时需要进行判断是否登录过、一般使用拦截器、过滤器
        if (session.getAttribute("loginUser") != null){
            //已经登录过的可以直接进入main页面
            return "main";
        }else {
            //没有登录过的再回到login页面，并出现提示
            model.addAttribute("msg","请重新登录");
            return "login";
        }
    }
}
