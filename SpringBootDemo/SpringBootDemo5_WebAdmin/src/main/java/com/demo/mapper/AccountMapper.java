package com.demo.mapper;


import com.demo.bean.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface AccountMapper {

    public Account getAcct(Integer id);
}
