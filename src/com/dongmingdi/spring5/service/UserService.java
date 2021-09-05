package com.dongmingdi.spring5.service;

import com.dongmingdi.spring5.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component(value = "userService")
@Service
public class UserService {

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    UserDao userDao;



    public void add() {
        System.out.println("service add .....");
//        userDao.update();
    }
}
