package com.itheima_05;

public class BasketballCoath extends Coach{

    public BasketballCoath() {
    }

    public BasketballCoath(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练员教如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练员吃羊肉，喝羊奶");
    }
}
