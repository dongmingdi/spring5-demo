package com.dongmingdi.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void update() {
        System.out.println("dao update ....");
    }
}
