package com.jyl.curd.mapper;

import com.jyl.curd.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    /**
     * add：增加信息
     * deleteByUsername：根据username删除信息
     * deleteAll：全删除
     * update：修改
     * get：查询
     * getByUsername：根据username查询
     * getLike：模糊查询
     */

    /**
     * add：添加user信息
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 根据username删除信息
     * @param username
     * @return
     */
    int deleteUserByUsername(String username);

    void deleteUserLike(String username);

    void deleteAll();

    int updateUser(User user);

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getUsers();

    User getUserByUsername(String username);

    List<User> getUserLike(String username);
}
