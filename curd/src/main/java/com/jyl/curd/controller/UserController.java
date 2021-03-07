package com.jyl.curd.controller;

import com.github.pagehelper.PageInfo;
import com.jyl.curd.entity.Person;
import com.jyl.curd.entity.User;
import com.jyl.curd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/getUserByUsername")
    public User getUserByUsername(@RequestParam("username") String username){
        return userService.getUserByUsername(username);
    }

    @GetMapping("/getUserLike")
    public List<User> getUserLike(@RequestParam("username") String username){
        return userService.getUserLike(username);
    }

    @GetMapping("/getPageInfo")
    public PageInfo<User> getPageInfo(@RequestParam("pageNum") int pageNum,
                                      @RequestParam("pageSize") int pageSize){
        return userService.getPageInfo(pageNum,pageSize);
    }

    @PostMapping("/addUser")
    public boolean addUser(@RequestBody User user){
        int res = userService.addUser(user);
        if (res == 0){
            return false;
        }else {
            return true;
        }
    }

    @PostMapping("/updateUser")
    public boolean updateUser(@RequestBody User user){
        int res = userService.updateUser(user);
        if (res == 0){
            return false;
        }{
            return true;
        }
    }

    @DeleteMapping("/deleteUserByUsername")
    public boolean deleteUserByUsername(@RequestParam("username") String username){
        int res = userService.deleteUserByUsername(username);
        if (res == 0){
            return false;
        }{
            return true;
        }
    }
}
