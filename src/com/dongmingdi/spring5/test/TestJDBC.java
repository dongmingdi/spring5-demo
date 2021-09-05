package com.dongmingdi.spring5.test;

import com.dongmingdi.spring5.entity.Book;
import com.dongmingdi.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJDBC {

    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mysql.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUsername("java");
        book.setUstatus("up");
        bookService.add(book);
    }
}
