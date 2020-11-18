package com.mzl.innerclasses;

/**
 * @ClassName： DotThis
 * @Description： 使用 .this 和 .new
 * @author：lhg
 * @data：2020/11/18 15:57
 * @Version：1.0
 * 访问外部类对象
 **/
public class DotThis {
    void f() { System.out.println("DotThis.f()"); }

    public class Inner {
        public DotThis outer() {
            // 返回玩不对象 DotThis 它自己
            return DotThis.this;
        }
    }

    public Inner inner() { return new Inner(); }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
