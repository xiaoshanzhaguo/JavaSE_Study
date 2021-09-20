package com.itheima_01;

import java.util.Scanner;
/*
    Scanner:
        用于获取键盘录入数据。(基本数据类型，字符串数据)

    public String nextLine()：
        获取键盘录入字符串数据
 */
public class ScannerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.println("请输入一个字符串数据：");
//        String line = sc.nextLine();
        String line = sc.nextLine();  // 按住ctrl+alt+v，会自动生成。

        //输出结果
        System.out.println("你输入的数据是：" + line);
    }
}
