package com.dongmingdi.spring5.aopanno;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void add() {
//        int t = 10/0;
        System.out.println("add.....");
    }
}
