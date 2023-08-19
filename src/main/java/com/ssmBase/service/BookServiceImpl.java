package com.ssmBase.service;

import com.ssmBase.mapper.BookMapper;
import com.ssmBase.pojo.Books;

import java.util.List;
import java.util.logging.Logger;

public class BookServiceImpl implements BookService {
    // 配置LOG4J
    private static final Logger logger = Logger.getLogger(String.valueOf(BookServiceImpl.class));

    // service调用mapper层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int insertBook(Books books) {
        return bookMapper.insertBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public List<Books> queryBookName(String bookName) {
        return bookMapper.queryBookName(bookName);
    }
}