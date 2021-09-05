package com.dongmingdi.spring5.aopanno;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {

    // 相同切入点抽取
    @Pointcut(value = "execution(* com.dongmingdi.spring5.aopanno.User.add(..))")
    public void pointdemo() {

    }

    @Before("pointdemo()")
    public void before() {
        System.out.println("personbefore.....");
    }
}
