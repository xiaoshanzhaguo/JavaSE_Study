package com.itheima_03;

public class JumppingOperator {

    public void useJumpping(Jumpping j) { //这里要的是该接口的实现类对象，按照多态的形式，创建对象
        j.jump();
    }

    public Jumpping getJumpping() {
        Jumpping j = new Cat();
        return j;
    }
}
