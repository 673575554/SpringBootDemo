package com.demo.mapper;


import com.demo.bean.Account;

@Mapper
public interface AccountMapper {

    public Account getAcct(Integer id);
}
