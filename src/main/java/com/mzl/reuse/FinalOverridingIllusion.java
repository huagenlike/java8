package com.mzl.reuse;

/**
 * @ClassName： FinalOverridingIllusion
 * @Description： final 和 private
 * @author：lhg
 * @data：2020/11/11 17:28
 * @Version：1.0
 * "覆写"只发生在方法是基类的接口时。也就是说，必须能将一个对象向上转型为基类并调用相同的方法（这一点在下一章阐明）。
 * 如果一个方法是 private 的，它就不是基类接口的一部分。
 * 它只是隐藏在类内部的代码，且恰好有相同的命名而已。
 * 但是如果你在派生类中以相同的命名创建了 public，protected 或包访问权限的方法，这些方法与基类中的方法没有联系，你没有覆写方法，只是在创建新的方法而已。
 **/
class WithFinals {
    // Identical to "private" alone:
    private final void f() {
        System.out.println("WithFinals.f()");
    }
    // Also automatically "final":
    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }

    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // You can upcast:
        OverridingPrivate op = op2;
        // But you can't call the methods:
        // op.f();
        // op.g();
        // Same here:
        WithFinals wf = op2;
        // wf.f();
        // wf.g();
    }
}
