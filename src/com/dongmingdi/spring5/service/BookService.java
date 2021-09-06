package com.dongmingdi.spring5.service;

import com.dongmingdi.spring5.dao.BookDao;
import com.dongmingdi.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    // 添加
    public void add(Book book) {
        bookDao.add(book);
    }

    // 修改
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    // 删除
    public void deleteBook(String id) {
        bookDao.deleteBook(id);
    }

    // 查询表中记录书
    public int findCount() {
        return bookDao.selectCount();
    }

    // 查询图书详情
    public Book findOne(String id) {
        return bookDao.findBookInfo(id);
    }

    // 查询返回图书集合
    public List<Book> findAll() {
        return bookDao.findAllBook();
    }
}
