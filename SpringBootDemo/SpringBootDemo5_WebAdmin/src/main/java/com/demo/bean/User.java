package com.demo.bean;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    /**
     * 所有属性都应该在数据库有
     */
    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String password;

//    以下为数据库字段

    private Long id;
    private String name;
    private Integer age;
    private String email;
}
