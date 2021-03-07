package com.demo.service.impl;

import com.demo.bean.Account;
import com.demo.mapper.AccountMapper;
import com.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account getAcctByid(Integer id){
        return accountMapper.getAcct(id);
    };


}
