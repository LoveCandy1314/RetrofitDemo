package com.example.administrator.retrofitdemo.staticproxy;

/**
 * @author Created by lichao
 * @desc 静态代理模式, 代理对象
 * @time 2018/5/4 13:25
 * 邮箱：lichao@voole.com
 */

public class BankSalesman implements IBank {
    //实际被代理对象
    private IBank iBank;

    public BankSalesman(IBank iBank) {
        this.iBank = iBank;
    }

    @Override
    public void applyBank() {
        System.out.println("数据统计");
        this.iBank.applyBank();
        System.out.println("完毕");
    }
}
