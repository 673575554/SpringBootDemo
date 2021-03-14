package com.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Junit5测试类")
public class Junit5Test {

    @DisplayName("测试Display注解")
    @Test
    void testDisplayName(){
        System.out.println(1);
    }

    @BeforeEach
    void testBeforeEach(){
        System.out.println("每一个测试开始就执行");
    }

    @AfterEach
    void testAfterEach(){
        System.out.println("每一个测试结束就执行");
    }

}
