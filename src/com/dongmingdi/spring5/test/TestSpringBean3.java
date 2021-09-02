package com.dongmingdi.spring5.test;

import com.dongmingdi.spring5.collectiontype.Book;
import com.dongmingdi.spring5.collectiontype.Stu;
import com.dongmingdi.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBean3 {

    @Test
    public void testCollectionBean() {
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        // 2 获取配置创建的对象
        Stu stu = context.getBean("stu", Stu.class);


        System.out.println(stu);
    }

    @Test
    public void testCollectionBeanUtils() {
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        // 2 获取配置创建的对象
        Stu stu = context.getBean("stu", Stu.class);

        Book book = context.getBean("book", Book.class);

        System.out.println(stu);

        System.out.println(book);
    }
}
