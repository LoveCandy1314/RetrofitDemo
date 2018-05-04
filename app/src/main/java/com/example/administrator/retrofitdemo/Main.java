package com.example.administrator.retrofitdemo;

import com.example.administrator.retrofitdemo.dynamic.DynamicBankProxy;
import com.example.administrator.retrofitdemo.dynamic.IBank;

import java.lang.reflect.Proxy;

/**
 * @author Created by lichao
 * @desc 代理模式测试方法.
 * @time 2018/5/4 13:35
 * 邮箱：lichao@voole.com
 */

public class Main {
    public static void main(String [] args){
        //静态代理模式实现方式
//        BankSalesman bankSalesman = new BankSalesman(new Man());
//        bankSalesman.applyBank();

        //动态代理模式实现方式
        com.example.administrator.retrofitdemo.dynamic.Man man = new com.example.administrator.retrofitdemo.dynamic.Man();
        IBank iBank= (IBank) Proxy.newProxyInstance(
                IBank.class.getClassLoader(),//classLoader
                new Class<?>[]{IBank.class},//目标接口//
                new DynamicBankProxy(man));//这个类是关键
        iBank.applyBank();

        iBank.bindBank();
    }
}
