package com.jyl.curd.mapper;

import com.jyl.curd.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class UserMapperTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserMapper userMapper;

    @Test
    void getUsers() {

        List<User> users = userMapper.getUsers();
        log.info("所有用户:{}",users);

    }
}