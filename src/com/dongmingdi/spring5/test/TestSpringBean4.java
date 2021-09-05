package com.dongmingdi.spring5.test;

import com.dongmingdi.spring5.bean.Orders;
import com.dongmingdi.spring5.collectiontype.Course;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBean4 {

    @Test
    public void testBeanLifeCycle() {
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        // 2 获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 得到bean对象");
        System.out.println(orders);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
