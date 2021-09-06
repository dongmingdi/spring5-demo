package com.dongmingdi.spring5.test;

import com.dongmingdi.spring5.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestTransaction {

    @Test
    public void testAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mysql.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }

}
