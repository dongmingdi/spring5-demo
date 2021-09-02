package com.dongmingdi.spring5.test;

import com.dongmingdi.spring5.collectiontype.Course;
import com.dongmingdi.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringFactoryBean {

    @Test
    public void testFactoryBean() {
        // 1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("factory-bean.xml");

        // 2 获取配置创建的对象
        Course course = context.getBean("myBean", Course.class);


        System.out.println(course);
    }
}
