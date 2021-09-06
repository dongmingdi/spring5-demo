package com.dongmingdi.spring5.test;

import com.dongmingdi.spring5.entity.Book;
import com.dongmingdi.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void testBatchAdds() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mysql.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"linux", "up"};
        batchArgs.add(o1);
        Object[] o2 = {"mysql", "down"};
        batchArgs.add(o2);
        Object[] o3 = {"c++", "up"};
        batchArgs.add(o3);
        System.out.println(Arrays.toString(bookService.batchAdds(batchArgs)));
    }

    @Test
    public void testBatchUpdate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mysql.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"linux1", "down", "4"};
        batchArgs.add(o1);
        Object[] o2 = {"mysql1", "up", "5"};
        batchArgs.add(o2);
        Object[] o3 = {"c++1", "down", "6"};
        batchArgs.add(o3);
        System.out.println(Arrays.toString(bookService.batchUpdate(batchArgs)));
    }

    @Test
    public void testBatchDelete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mysql.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"4"};
        batchArgs.add(o1);
        Object[] o2 = {"5"};
        batchArgs.add(o2);
        Object[] o3 = {"6"};
        batchArgs.add(o3);
        System.out.println(Arrays.toString(bookService.batchDelete(batchArgs)));
    }
}
