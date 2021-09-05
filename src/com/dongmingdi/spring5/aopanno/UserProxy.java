package com.dongmingdi.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class UserProxy {

    // 相同切入点抽取
    @Pointcut(value = "execution(* com.dongmingdi.spring5.aopanno.User.add(..))")
    public void pointdemo() {

    }

    @Before("pointdemo()")
    public void before() {
        System.out.println("before.....");
    }

    @After("pointdemo()")
    public void after() {
        System.out.println("after.....");
    }

    @AfterReturning("pointdemo()")
    public void afterReturning() {
        System.out.println("afterReturning.....");
    }

    @AfterThrowing("pointdemo()")
    public void afterThrowing() {
        System.out.println("afterThrowing.....");
    }

    @Around("execution(* com.dongmingdi.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.....");
        //被增强的方法
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后.....");
    }
}
