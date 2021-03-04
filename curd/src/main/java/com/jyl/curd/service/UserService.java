package com.jyl.curd.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jyl.curd.entity.User;
import com.jyl.curd.mapper.PersonMapper;
import com.jyl.curd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//控制事物属性
@Transactional
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    PersonMapper personMapper;

    public int addUser(User user){
        return userMapper.addUser(user);
    }

    public int deleteUserByUsername(String username){
        if (personMapper.getPersonByUsername(username)!= null){
            personMapper.deletePersonByUsername(username);
        }
        return userMapper.deleteUserByUsername(username);
    }

    public void deleteUserLike(String username){
        userMapper.deleteUserLike(username);
    }

    public void deleteAll(){
        userMapper.deleteAll();
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }

    public List<User> getUsers(){
        return userMapper.getUsers();
    }

    public User getUserByUsername(String username){
        return userMapper.getUserByUsername(username);
    }

    //分页查询
    public PageInfo<User> getPageInfo(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userMapper.getUsers();
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        return pageInfo;
    }

    public List<User> getUserLike(String username){
        return userMapper.getUserLike("%"+username+"%");
    }

}
