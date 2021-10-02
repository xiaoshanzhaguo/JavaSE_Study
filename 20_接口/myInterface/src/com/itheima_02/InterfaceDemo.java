package com.itheima_02;

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
//        i.num = 20;  //接口里的变量默认被final修饰
        System.out.println(i.num);
//        i.num2 = 40; //这里被final修饰
        System.out.println(i.num2);
        System.out.println(Inter.num2);
    }
}
