package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主程序类，所有启动的入口
 * @SpringBootApplication：这是一个Spring应用
 * */
//@SpringBootApplication(scanBasePackages = "com")

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com")
public class Application {
    public static void main(String[] args) {
        //1、返回我们IOC容器 -- 使用快捷补全查看详情
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

        //2、查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }
    }
}
