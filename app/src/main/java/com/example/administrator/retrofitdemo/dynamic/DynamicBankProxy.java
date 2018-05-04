package com.example.administrator.retrofitdemo.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Created by lichao
 * @desc 动态代理设计模式 InvocationHandler
 * @time 2018/5/4 13:41
 * 邮箱：lichao@voole.com
 */

public class DynamicBankProxy implements InvocationHandler {
    private Object object;
    public DynamicBankProxy(Object o){
        this.object=o;
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        //目标接口调用的方法都会来到这里面
        System.out.println("method name is "+method.getName());
        System.out.println("统计数据");
        //这里其实调用的就是我们man里面的applay方法
        Object result= method.invoke(object,objects);
        System.out.println("成功");
        return result;
    }
}
