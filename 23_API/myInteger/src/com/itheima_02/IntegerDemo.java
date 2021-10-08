package com.itheima_02;

/*
    构造方法：
        public Integer(int value)：根据 int 值创建 Integer 对象(过时)
        public Integer(String s)：根据 String 值创建 Integer 对象(过时)

    静态方法获取对象：
        public static Integer valueOf(int i)：返回表示指定的 int 值的 Integer 实例
        public static Integer valueOf(String s)：返回一个保存指定值的 Integer 对象 String
 */
public class IntegerDemo {
    public static void main(String[] args) {
        /*
        //public Integer(int value)：根据 int 值创建 Integer 对象(过时)
        Integer i1 = new Integer(100);
        System.out.println(i1); //这里输出的是100，并没有输出地址，说明上面重写了toString方法

        //public Integer(String s)：根据 String 值创建 Integer 对象(过时)
//        Integer i2 = new Integer("100");
        Integer i2 = new Integer("abc"); //NumberFormatException 这里的字符串，应该是由数字组成的字符串。
        System.out.println(i2);
         */

        //public static Integer valueOf(int i)：返回表示指定的 int 值的 Integer 实例
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        //public static Integer valueOf(String s)：返回一个保存指定值的 Integer 对象 String
        Integer i2 = Integer.valueOf("100");
//        Integer i2 = Integer.valueOf("abc"); //这里写字母也是不可以的
        System.out.println(i2);
    }
}
