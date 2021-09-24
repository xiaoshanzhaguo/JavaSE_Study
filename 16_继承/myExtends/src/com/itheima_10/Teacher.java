package com.itheima_10;

public class Teacher extends Person{

    //还要手动再给一些无参构造方法
    public Teacher() {}

    public Teacher(String name, int age) {
//        this.name = name;
//        this.age = age;
        super(name, age);
    }

    public void teach() {
        System.out.println("用爱成就每一位成员");
    }
}
