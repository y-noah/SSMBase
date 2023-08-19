package com.ssmBase.mapper;

import com.ssmBase.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    // 增
    int insertBook(Books books);
    // 删
    int deleteBook(@Param("bookID") int id);
    // 改
    int updateBook(Books books);
    // 查(单个)
    Books queryBookById(int id);
    // 查(全部)
    List<Books> queryAllBook();
    // 查(模糊)
    List<Books> queryBookName(@Param("bookName") String bookName);
}
