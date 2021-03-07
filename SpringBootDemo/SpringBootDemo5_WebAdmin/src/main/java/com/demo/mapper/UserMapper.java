package com.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 继承BaseMapper，不需要编写xml文件
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
