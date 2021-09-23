package com.itheima_07;

public class Zi extends Fu {

    /*
    @overwrite
    private void show() {
        System.out.println("Zi中show()方法被调用");
    }
     */

    /*
    @Override
    public void method() {
        System.out.println("Fu中method()方法被调用");
    }
     */

    @Override
    public void method() {  //不写public用默认的权限
        System.out.println("Fu中method()方法被调用");
    }
}
