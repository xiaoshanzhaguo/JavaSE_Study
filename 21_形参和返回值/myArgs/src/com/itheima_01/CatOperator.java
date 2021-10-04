package com.itheima_01;

public class CatOperator {

    public void useCat(Cat c) {  //这里要的是一个对象，而不是一个变量 相当于Cat c = new Cat();
        c.eat();
    }

    public Cat getCat() {
        Cat c = new Cat();
        return c;
    }
}
