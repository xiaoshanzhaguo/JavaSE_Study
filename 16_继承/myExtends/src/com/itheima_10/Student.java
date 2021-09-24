package com.itheima_10;

public class Student extends Person{

    public Student(){}

    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("用心去学习");
    }
}
