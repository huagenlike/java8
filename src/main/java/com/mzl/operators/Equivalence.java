package com.mzl.operators;

/**
 * @description: 测试对象等价
 * @author: lhg
 * @date: Created in 2020/7/3 15:56
 * @version:
 * @modified By:
 * == 和 != 比较的是对象引用
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = 47;
        Integer n2 = 47;
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
    }
}
