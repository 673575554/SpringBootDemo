package com.demo;

import com.demo.bean.User;
import com.demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserMapper userMapper;


    @Test
    void contextLoads() {

//        jdbcTemplate.queryForObject("select * from test");
//        jdbcTemplate.queryForList("select * from test.class");
        Object o = jdbcTemplate.queryForList("select count(*) from test.class");
        log.info("总数：{}",o);
    }

    @Test
    void testUserMapper(){
        User user = userMapper.selectById(1L);
        log.info("用户信息：{}",user);
    }

}
