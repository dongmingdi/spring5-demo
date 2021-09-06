package com.dongmingdi.spring5.service;

import com.dongmingdi.spring5.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ, timeout = 5, readOnly = false, rollbackFor = {NullPointerException.class}, noRollbackFor = {ArithmeticException.class})
public class AccountService {
    @Autowired
    public AccountDao accountDao;

    // 转账的方法
    public void accountMoney() {

//        try {
//            //　开启事务

            accountDao.reduceMoney();

            int i = 10/0;

            accountDao.addMoney();
//
//            // 提交
//        } catch (Exception e) {
//            // 回滚
//        } finally {
//            // 必执行逻辑
//        }


    }
}
