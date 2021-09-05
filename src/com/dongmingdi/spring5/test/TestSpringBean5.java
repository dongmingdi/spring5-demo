package com.dongmingdi.spring5.test;

import com.dongmingdi.spring5.autowire.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBean5 {

    @Test
    public void testBeanAutowire() {
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");

        // 2 获取配置创建的对象
        Emp emp = context.getBean("empAuto", Emp.class);

        System.out.println(emp);
    }
}
