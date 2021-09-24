package com.itheima_01;

/*
    测试类
 */
public class Demo {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method(); //虽然这里不可以被重写方法，但是子类还是可调用父类的共有方法。
        z.show();
    }
}
