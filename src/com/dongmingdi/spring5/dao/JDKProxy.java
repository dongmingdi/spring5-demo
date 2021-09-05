package com.dongmingdi.spring5.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        // 创建接口实现类的代理对象
        Class[] interfaces = {MathDao.class};
        MathDaoImpl mathDao = new MathDaoImpl();
        MathDao dao = (MathDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new MathDaoProxy(mathDao));
//        String id = dao.update("aaa");
//        System.out.println("result:" + id);

        int res = dao.add(1, 2);
        System.out.println("result:" + res);
    }
}

// 创建代理对象的代码
class MathDaoProxy implements InvocationHandler {

    // 把创建是谁的代理对象的谁传递过来
    // 有参数构造传递
    private Object obj;
    public MathDaoProxy(Object obj){
        this.obj = obj;
    }

    // 增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 增强方法之前处理
        System.out.println("方法之前执行... " + method.getName() + "传递参数： " + Arrays.toString(args));
        Object res = method.invoke(obj, args);
        // 增强方法之后处理
        System.out.println("方法之后执行... " + obj);
        return res;
    }
}
