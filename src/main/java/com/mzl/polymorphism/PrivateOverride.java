package com.mzl.polymorphism;

/**
 * @ClassName： PrivateOverride
 * @Description： 陷阱：“重写”私有方法
 * @author：lhg
 * @data：2020/11/13 11:20
 * @Version：1.0
 *  private 方法可以当作是 final 的，对于派生类来说是隐蔽的。
 *  因此，这里 Derived 的 f() 是一个全新的方法；因为基类版本的 f() 屏蔽了 Derived ，因此它都不算是重写方法。
 **/
public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}
