package com.dongmingdi.spring5.test;

import com.dongmingdi.spring5.config.TxConfig;
import com.dongmingdi.spring5.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;


public class TestTransaction {

    @Test
    public void testAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("mysql.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }

    @Test
    public void testAccount2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.accountMoney();
    }
}
