package com.itheima_04;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println("--------");

        a = new Cat("加菲", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        Animal d = new Dog();
        d.setName("Tina");
        d.setAge(3);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        System.out.println("--------");

        d = new Dog("Tina", 3);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
    }
}
