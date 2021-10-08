package com.itheima_04;

/*
    装箱：把基本数据类型转换为对应的包装类类型
    拆箱：把包装类类型转换为对应的基本数据类型
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //装箱：把基本数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100); //装箱（调方法了）
        Integer ii = 100; //自动装箱

        //拆箱：把包装类类型转换为对应的基本数据类型
        ii += 200;  //它直接这样写也是可以的，这里隐藏了自动拆箱和自动装箱
        ii = ii.intValue() + 200;  //ii.intValue()是手动拆箱拆箱，加上200变成基本数据类型。 显然后面就是多了一个装箱操作
        System.out.println(ii);

        Integer iii = null;
        if (iii != null) {  //这里要加判断
            iii += 300;//NullPointerException  这里相当于调用了null.intValue(),所以就会报异常
        }

    }
}
