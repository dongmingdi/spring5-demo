package com.dongmingdi.spring5.dao;

import com.dongmingdi.spring5.entity.Book;

import java.util.List;

public interface BookDao {
    void add(Book book);

    void updateBook(Book book);

    void deleteBook(String id);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    int[] batchAdds(List<Object[]> batchArgs);

    int[] batchUpdate(List<Object[]> batchArgs);

    int[] batchDelete(List<Object[]> batchArgs);
}
