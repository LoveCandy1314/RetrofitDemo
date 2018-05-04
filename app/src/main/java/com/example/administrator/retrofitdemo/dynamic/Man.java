package com.example.administrator.retrofitdemo.dynamic;

/**
 * @author Created by lichao
 * @desc 静态代理模式,被代理对象
 * @time 2018/5/4 13:26
 * 邮箱：lichao@voole.com
 */

public class Man implements IBank {
    @Override
    public void applyBank() {
        System.out.println("办卡");
    }

    @Override
    public void bindBank() {
        System.out.println("绑定卡片");
    }
}
