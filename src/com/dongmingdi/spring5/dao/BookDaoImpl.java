package com.dongmingdi.spring5.dao;

import com.dongmingdi.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into t_book (username, ustatus) Value(?, ?)";
        int update = jdbcTemplate.update(sql, book.getUsername(), book.getUstatus());
        System.out.println(update);
    }
}
