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
        book.setUsername("php");
        book.setUstatus("up1");
        bookService.add(book);
    }

    @Test
    public void testUpdate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mysql.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1");
        book.setUsername("php");
        book.setUstatus("down");
        bookService.updateBook(book);
    }

    @Test
    public void testDelete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mysql.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteBook("1");
    }

    @Test
    public void testCount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mysql.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.findCount());
    }

    @Test
    public void testFindOne() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mysql.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.findOne("2").toString());
    }

    @Test
    public void testFindAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mysql.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println(bookService.findAll());
    }
}
