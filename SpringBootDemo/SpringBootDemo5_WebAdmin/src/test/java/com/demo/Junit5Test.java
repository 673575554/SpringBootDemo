package com.demo;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Junit5测试类")
public class Junit5Test {

    @DisplayName("测试Display注解")
    //单元测试注解
    @RepeatedTest(2)
    //    重复测试
    @Test
    void testDisplayName(){
        System.out.println(1);
    }

    @Disabled
    @DisplayName("测试Display注解2")
    @Test
    void testDisplayName2(){
        System.out.println(2);
    }

    //超时方法限制
    @Timeout(value = 5,unit = TimeUnit.MINUTES)
    @Test
    void testTimeout() throws InterruptedException{
        try {
            Thread.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * 如果使用断言，如果前面断言失败，那后面的代码都将不会执行
     */
    //断言测试
    @DisplayName("测试简单断言")
    @Test
    void testSimpleAssertion(){
        int cal = cal(2, 3);
        //判断相等
        assertEquals(5,cal,"逻辑业务计算失败");

        Object obj1 = new Object();
        Object obj2 = new Object();
        assertSame(obj1,obj2,"不是一个对象");
    }

    //组合断言
    @Test
    @DisplayName("断言组合")
    void all(){
        /**
         * 所有断言执行通过才通过
         */
        assertAll("test",
                ()-> assertTrue(true && true),
                ()-> assertEquals(1,2,"不符合期望"));
    }

    int cal(int i,int j){
        return i+j;
    }

//    异常断言
    @DisplayName("异常断言")
    @Test
    void testException(){
        assertThrows(ArithmeticException.class,()->{
            int i = 10/2;
        },"业务错误");
    }

//    测试失败
    @DisplayName("测试失败")
    @Test
    void testFail(){
        if(2==2){
            fail("测试失败");
        }
    }

    //测试前置条件
    @Test
    @DisplayName("测试前置条件")
    void testassumption(){
        Assumptions.assumeTrue(false,"结果不是true");
        System.out.println("1111");
    }










    //每个单元测试前执行
    @BeforeEach
    void testBeforeEach(){
        System.out.println("每一个测试开始就执行");
    }

    //每个单元测试后执行
    @AfterEach
    void testAfterEach(){
        System.out.println("每一个测试结束就执行");
    }

    //所有单元测试前执行
    @BeforeAll
    static void testBeforeAll(){
        System.out.println("所有测试开始前执行");
    }

    //所有单元测试后执行
    @AfterAll
    static void testAfterAll(){
        System.out.println("所有测试都执行完啦");
    }

}
