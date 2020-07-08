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
        System.out.println(v1.equals(v2));
        System.out.println(v1.i == v2.i);
    }
}