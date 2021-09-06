package com.dongmingdi.spring5.service;

import com.dongmingdi.spring5.dao.BookDao;
import com.dongmingdi.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    // 添加
    public void add(Book book) {
        bookDao.add(book);
    }

    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    public void deleteBook(String id) {
        bookDao.deleteBook(id);
    }
}
