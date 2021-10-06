package com.itheima_02;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {  //s2传递到这里，作的是向上转型
        /*
            this --- s1
            0    --- s2
         */
        //比较地址是否相同，如果相同，直接返回true
        if (this == o) return true;

        //判断参数是否为null，
        //然后判断两个对象是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;

        //向下转型
        Student student = (Student) o;  //student = s2;

        // 比较年龄和性别是否相同
        return age == student.age && Objects.equals(name, student.name);
    }
}
