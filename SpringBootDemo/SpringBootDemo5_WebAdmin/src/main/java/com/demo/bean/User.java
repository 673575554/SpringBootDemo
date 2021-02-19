package com.demo.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private String userName;
    private String password;

}
