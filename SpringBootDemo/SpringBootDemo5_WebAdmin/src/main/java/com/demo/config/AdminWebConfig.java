package com.demo.config;

import com.demo.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器的相关配置
 * 1、编写一个拦截器，实现HandLerInterceptor接口
 * 2、拦截器注册到容器中，实现WebMvcConfigurer的addInterceptor
 * 3、指定拦截规则【如果拦截所有，静态资源也会被拦截】
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                //拦截所有请求,也会拦截静态资源,也要放行
                .addPathPatterns("/**")
                //放行登录页的请求
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**","/upload");

    }
}
