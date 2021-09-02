package com.dongmingdi.spring5.test;

import com.dongmingdi.spring5.Book;
import com.dongmingdi.spring5.Orders;
import com.dongmingdi.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBean1 {

    @Test
    public void testAdd() {
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2 获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook() {
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2 获取配置创建的对象
        Book book1 = context.getBean("book", Book.class);

        Book book2 = context.getBean("book", Book.class);

        System.out.println(book1);System.out.println(book2);
    }

    @Test
    public void testOrders() {
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2 获取配置创建的对象
        Orders orders = context.getBean("orders1", Orders.class);

        System.out.println(orders);
    }
}
