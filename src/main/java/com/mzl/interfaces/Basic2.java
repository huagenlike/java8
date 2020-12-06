package com.mzl.interfaces;

/**
 * @ClassName： Basic2
 * @Description：
 * @author：lhg
 * @data：2020/11/17 10:18
 * @Version：1.0
 * 如果创建一个继承抽象类的新类并为之创建对象，那么就必须为基类的所有抽象方法提供方法定义。
 * 如果不这么做（可以选择不做），新类仍然是一个抽象类，编译器会强制我们为新类加上 abstract 关键字。
 **/
abstract class Basic2 extends Basic {

    int f() {
        return 111;
    }

    /*abstract void g() {
        // unimplemented() still not implemented
    }*/
}
