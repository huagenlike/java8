package com.mzl.reuse;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/9 9:42
 * @version:
 * @modified By:
 * 【@Override】当你打算重写一个方法时，你可以选择添加这个注释，如果你不小心用了重载而不是重写，编译器会产生一个错误消息
 */
public class Lisa extends Homer {
    // 因为 Homer 类中没有 void doh(Milhouse m) 方法，所以不能够重写，@Override注解会报错
    //@Override
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
}
