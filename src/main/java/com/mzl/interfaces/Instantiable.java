package com.mzl.interfaces;

/**
 * @ClassName： Instantiable
 * @Description：
 * @author：lhg
 * @data：2020/11/17 10:25
 * @Version：1.0
 * 为了创建可初始化的类，就要继承抽象类，并提供所有抽象方法的定义
 **/
abstract class Uninstantiable {
    abstract void f();
    abstract int g();
}

public class Instantiable extends Uninstantiable {
    @Override
    void f() {
        System.out.println("f()");
    }

    @Override
    int g() {
        return 22;
    }

    public static void main(String[] args) {
        Uninstantiable ui = new Instantiable();
    }
}