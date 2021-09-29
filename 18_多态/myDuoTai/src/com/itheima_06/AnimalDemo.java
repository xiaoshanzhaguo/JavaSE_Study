package com.itheima_06;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加菲猫", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        Animal d = new Dog();
        d.setName("哈士奇");
        d.setAge(6);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();

        d = new Dog("哈士奇", 6);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
    }
}
