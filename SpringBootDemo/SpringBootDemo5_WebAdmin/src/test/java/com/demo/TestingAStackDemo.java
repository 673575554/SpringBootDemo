package com.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

@DisplayName("嵌套测试")
public class TestingAStackDemo {

    @DisplayName("参数化测试")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void testParameterized(int i){
        System.out.println(i);
    }

    @DisplayName("方法参数化测试")
    @ParameterizedTest
    @MethodSource("stringProvider")
    void testParameterized2(int i){
        System.out.println(i);
    }

    static Stream<String> stringProvider(){
        return Stream.of("apple","banana","pear");
    }

}
