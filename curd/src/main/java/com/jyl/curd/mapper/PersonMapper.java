package com.jyl.curd.mapper;

import com.jyl.curd.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonMapper {

    /**
     * 新增person
     * @param person--person对象
     * @return 状态码
     */
    int addPerson(Person person);

    /**
     * 通过username删除person
     * @param username--username属性
     * @return 状态码
     */
    int deletePersonByUsername(String username);

    /**
     * 通过username中的字符删除person
     * @param username--username属性
     */
    void deletePersonLike(String username);

    /**
     * 删除person表全部数据
     */
    void deleteAll();

    /**
     * 传入person对象更新数据
     * @param person--person对象
     * @return 状态码
     */
    int updatePerson(Person person);

    /**
     * 得到所有personDAO
     * @return Person列表
     */
    List<Person> getPersons();

    /**
     * 通过username得到personDAO
     * @param username--属性
     * @return personDAO
     */
    Person getPersonByUsername(String username);

    /**
     * 通过username中字符获得personDAO数组
     * @param username--属性
     * @return personDAO数组
     */
    List<Person> getPersonLike(String username);
}
