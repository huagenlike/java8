package com.mzl.innerclasses.mui;

/**
 * @ClassName： MultiInterfaces
 * @Description： 为什么需要内部类
 * @author：lhg
 * @data：2020/11/20 11:21
 * @Version：1.0
 * 类可以实现多种接口的两种方式
 **/
interface A {}
interface B {}
class X implements A, B {}
class Y implements A {
    B makeB() {
        // 匿名内部阶级:
        return new B() {};
    }
}
public class MultiInterfaces {
    static void takesA(A a) {}
    static void takesB(B b) {}
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}
