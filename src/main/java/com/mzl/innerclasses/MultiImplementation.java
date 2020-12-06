package com.mzl.innerclasses;

/**
 * @ClassName： MultiImplementation
 * @Description： 为什么需要内部类
 * @author：lhg
 * @data：2020/11/20 11:24
 * @Version：1.0
 * 如果拥有的是抽象的类或具体的类，而不是接口，那就只能使用内部类才能实现多重继承
 **/

class D {}

abstract class E {}

class Z extends D {
    E makeE() {
        return new E() {};
    }
}

public class MultiImplementation {
    static void takesD(D d) {}
    static void takesE(E e) {}

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}
