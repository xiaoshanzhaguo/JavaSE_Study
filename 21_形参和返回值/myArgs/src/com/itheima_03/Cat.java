package com.itheima_03;

public class Cat implements Jumpping{

    @Override //重写接口中的方法
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}
