package com.mzl.innerclasses;

/**
 * @ClassName： AnonymousConstructor
 * @Description：
 * @author：lhg
 * @data：2020/11/20 10:43
 * @Version：1.0
 * 为匿名内部类创建构造函数
 * 在匿名类中不可能有命名构造器（因为它根本没名字！），但通过实例初始化，就能够达到为匿名内部类创建一个构造器的效果
 **/
abstract class Base {
    Base(int i) {
        System.out.println("Base constructor, i = " + i);
    }
    public abstract void f();
}
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            { System.out.println("Inside instance initializer"); }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }
    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}