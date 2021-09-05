package com.dongmingdi.spring5.test;

import com.dongmingdi.spring5.autowire.Emp;
import com.dongmingdi.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBean7 {

    @Test
    public void testService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
