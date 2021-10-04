package com.itheima_05;

public class PersonDemo {
    public static void main(String[] args) {
        //创建对象
        PingpangPlayer ppp = new PingpangPlayer();
        ppp.setName("王浩");
        ppp.setAge(30);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();

        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("李宏刚");
        bp.setAge(25);
        System.out.println(bp.getName() + "," + bp.getAge());
        bp.eat();
        bp.study();

        PingpangCoath ppc = new PingpangCoath();
        ppc.setName("李红波");
        ppc.setAge(45);
        System.out.println(ppc.getName() + "," + ppc.getAge());
        ppc.teach();
        ppc.eat();
        ppc.speak();

        BasketballCoath bc = new BasketballCoath();
        bc.setName("刘波");
        bc.setAge(40);
        System.out.println(bc.getName() + "," + bc.getAge());
        bc.teach();
        bc.eat();
    }
}
