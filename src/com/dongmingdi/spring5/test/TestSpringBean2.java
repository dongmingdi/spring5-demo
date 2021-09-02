package com.dongmingdi.spring5.test;

import com.dongmingdi.spring5.bean.Emp;
import com.dongmingdi.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBean2 {

    @Test
    public void testOutBean() {
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        // 2 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void testInBean() {
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        // 2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);
    }

    @Test
    public void testTreeBean() {
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        // 2 获取配置创建的对象
        Emp emp = context.getBean("emp1", Emp.class);

        System.out.println(emp);
    }
}
