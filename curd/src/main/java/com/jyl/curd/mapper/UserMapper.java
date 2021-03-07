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
     * @param user-用户DAO
     * @return 返回状态码
     */
    int addUser(User user);

    /**
     * 根据username删除信息
     * @param username--name属性
     * @return 返回状态码
     */
    int deleteUserByUsername(String username);

    /**
     * 根据username中的字符删除信息
     * @param username--name属性
     */
    void deleteUserLike(String username);

    /**
     * 删除所有user信息
     */
    void deleteAll();

    /**
     *更新user信息
     * @param user--用户DAO
     * @return 返回状态码
     */
    int updateUser(User user);

    /**
     * 获取所有用户信息
     * @return  user列表
     */
    List<User> getUsers();

    /**
     * 根据username得到user信息
     * @param username--username属性
     * @return user对象
     */
    User getUserByUsername(String username);

    /**
     * 通过username中的字符获取user列表信息
     * @param username--属性
     * @return user列表
     */
    List<User> getUserLike(String username);
}
