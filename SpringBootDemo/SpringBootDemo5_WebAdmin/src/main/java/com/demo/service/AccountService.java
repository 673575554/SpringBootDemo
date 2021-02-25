package com.demo.service;

import com.demo.bean.Account;
import com.demo.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account getAcctByid(Integer id){
        Account acct = accountMapper.getAcct(id);
        return acct;
    }

}
