package com.demo.mapper;

import com.demo.bean.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CityMapper {

    @Select("SELECT * FROM test.city where id=#{id}")
    public City getByID(Long id);

    @Update("insert into test.city(`name`,`state`,`country`) values(#{name},#{state},#{country})")
    @Options(useGeneratedKeys=true,keyProperty="id")
    public void insert(City city);
}
