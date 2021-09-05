package com.dongmingdi.spring5.test;

import com.dongmingdi.spring5.aopanno.User;
import com.dongmingdi.spring5.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAop {

    @Test
    public void testAopAnno() {
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-anno.xml");

        // 2 获取配置创建的对象
        User user = context.getBean("user", User.class);

        user.add();
    }

    @Test
    public void testAopXml() {
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

        // 2 获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        book.buy();
    }
}
