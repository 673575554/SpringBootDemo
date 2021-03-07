package com.curd2.mapper;


import com.curd2.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface BookMapper {

    /**
     * 添加一本书
     * @param book-book对象
     * @return 响应码
     */
    public boolean addBook(Book book);

    /**
     * 通过id删除
     * @param id-id
     * @return 布尔值
     */
    public boolean deleteBookById(long id);

    /**
     * 更新书的信息
     * @param book-对象
     * @return 响应码
     */
    public boolean updateBook(Book book);


    /**
     * 得到所有书本
     * @return book列表
     */
    public List<Book> getBook();

}
