package com.mzl.operators;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/3 16:04
 * @version:
 * @modified By:
 */
// operators/EqualsMethod2.java
// 默认的 equals() 方法没有比较内容
class Value {
    int i;
}

public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        // equals() 的默认行为是比较对象的引用而非具体内容。因此，除非你在新类中覆写 equals() 方法，否则我们将获取不到想要的结果。
        // 引用的地址不一样
        System.out.println(v1.equals(v2));
        // 这里比的是数值，所以是 true
        System.out.println(v1.i == v2.i);

        Value v3 = v2;
        // 引用地址一样，所以是 true
        System.out.println(v2.equals(v3));
    }
}