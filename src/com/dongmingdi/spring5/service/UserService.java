package com.dongmingdi.spring5.service;

import com.dongmingdi.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component(value = "userService")
@Service
public class UserService {

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

//    @Autowired
//    @Qualifier(value = "userDaoImpl1")
//    UserDao userDao;

    @Resource(name = "userDaoImpl1")
    private UserDao userDao;

    @Value(value = "abc")
    private String uname;



    public void add() {
        System.out.println("service add ..... " + uname);
        userDao.update();
    }
}
