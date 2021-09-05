package com.dongmingdi.spring5.test;

import com.dongmingdi.spring5.config.SpringConfig;
import com.dongmingdi.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringConfig {

    @Test
    public void testConfigClass() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
