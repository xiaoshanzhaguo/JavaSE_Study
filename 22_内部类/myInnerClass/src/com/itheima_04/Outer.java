package com.itheima_04;
/*
    前提：
	    存在一个类或者接口
		这里的类可以是具体类也可以是抽象类

	格式：
		new 类名或者接口名(){
			重写方法;
		};

	本质是什么呢?
	    是一个继承了该类或者实现了该接口的子类匿名对象
 */
public class Outer {

    public void method() {
//        new Inter() {  //这里本质是个对象，但是对象没有名字而已
//            @Override
//            public void show() {
//                System.out.println("匿名内部类");
//            }
//        };

//        show();

        /*
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();

        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();
         */

        Inter i = new Inter() {  //这里应该是Inter实现的类对象，故可以使用多态的形式赋值给接口
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();
        i.show();
    }

}
