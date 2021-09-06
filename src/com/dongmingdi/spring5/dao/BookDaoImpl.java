package com.dongmingdi.spring5.dao;

import com.dongmingdi.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set username = ?, ustatus = ? where user_id=?";
        Object[] args = {book.getUsername(), book.getUstatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void deleteBook(String id) {
        String sql = "delete from t_book where user_id = ?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(1) from t_book";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from t_book where user_id = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }

    @Override
    public int[] batchAdds(List<Object[]> batchArgs) {
        String sql = "insert into t_book (username, ustatus) Value(?, ?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        return ints;
    }

    @Override
    public int[] batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_book set username = ?, ustatus = ? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        return ints;
    }

    @Override
    public int[] batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from t_book where user_id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        return ints;
    }
}
