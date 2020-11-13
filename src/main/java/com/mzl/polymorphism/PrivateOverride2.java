package com.mzl.polymorphism;

/**
 * @ClassName： PrivateOverride2
 * @Description： 陷阱：“重写”私有方法
 * @author：lhg
 * @data：2020/11/13 11:22
 * @Version：1.0
 * 结论是只有非 private 方法才能被重写，但是得小心重写 private 方法的现象，编译器不报错，但不会按我们所预期的执行。
 * 为了清晰起见，派生类中的方法名采用与基类中 private 方法名不同的命名。 *
 * 如果使用了 @Override 注解，就能检测出问题：
 **/
public class PrivateOverride2 {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride2 po = new Derived2();
        po.f();
    }
}

class Derived2 extends PrivateOverride2 {
    // 使用了 @Override 注解，就能检测出问题：
    // @Override
    public void f() {
        System.out.println("public f()");
    }
}
