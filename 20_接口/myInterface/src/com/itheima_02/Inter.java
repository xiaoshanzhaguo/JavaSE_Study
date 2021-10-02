package com.itheima_02;

public interface Inter {
    public int num = 10;
    public final int num2 = 20;
//    public static final int num3 = 30;
    int num3 = 30;  // int前面的部分，是灰色的，意味着可以不写

//    public Inter() {}

//    public void show() {}

    public abstract void method();

    void show();
}
