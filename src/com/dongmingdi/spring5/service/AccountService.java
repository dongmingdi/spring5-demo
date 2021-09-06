package com.dongmingdi.spring5.service;

import com.dongmingdi.spring5.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    public AccountDao accountDao;

    // 转账的方法
    public void accountMoney() {

        accountDao.reduceMoney();

        accountDao.addMoney();
    }
}
