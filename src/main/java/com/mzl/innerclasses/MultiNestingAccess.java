package com.mzl.innerclasses;

/**
 * @ClassName： MultiNestingAccess
 * @Description： 从多层嵌套类中访问外部类的成员
 * @author：lhg
 * @data：2020/11/20 11:12
 * @Version：1.0
 * 嵌套类可以访问嵌套在其内的所有级别的所有成员
 **/
class MNA {
    private void f() {}
    class A {
        private void g() {}
        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
