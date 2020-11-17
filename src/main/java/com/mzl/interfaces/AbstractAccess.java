package com.mzl.interfaces;

/**
 * @ClassName： AbstractAccess
 * @Description：
 * @author：lhg
 * @data：2020/11/17 10:28
 * @Version：1.0
 * private abstract 被禁止了是有意义的，因为你不可能在 AbstractAccess 的任何子类中合法地定义它。
 **/
abstract class AbstractAccess {
    private void m1() {}

    // private abstract void m1a(); // illegal

    protected void m2() {}

    protected abstract void m2a();

    void m3() {}

    abstract void m3a();

    public void m4() {}

    public abstract void m4a();
}
