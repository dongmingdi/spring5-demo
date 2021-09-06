package com.dongmingdi.spring5.dao;

import com.dongmingdi.spring5.entity.Book;

public interface BookDao {
    void add(Book book);

    void updateBook(Book book);

    void deleteBook(String id);
}
