package com.mzl.interfaces;

/**
 * @ClassName： InterfaceCollision
 * @Description： 结合接口时的命名冲突
 * @author：lhg
 * @data：2020/11/17 15:26
 * @Version：1.0
 * 覆写、实现和重载令人不快地搅和在一起带来了困难。同时，重载方法仅根据返回类型是区分不了的。
 * 当打算组合接口时，在不同的接口中使用相同的方法名通常会造成代码可读性的混乱，尽量避免这种情况。
 **/
interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {
    @Override
    public void f() {}

    @Override
    public int f(int i) {
        return 1;  // 重载
    }
}

class C3 extends C implements I2 {
    @Override
    public int f(int i) {
        return 1; // 重载
    }
}

class C4 extends C implements I3 {
    // 完全相同，没问题
    @Override
    public int f() {
        return 1;
    }
}

// 方法的返回类型不同
//- class C5 extends C implements I1 {}
//- interface I4 extends I1, I3 {}