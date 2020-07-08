package com.mzl.operators;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/3 15:40
 * @version:
 * @modified By:
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i: " + i);
        System.out.println("++i: " + ++i); // 前递增
        System.out.println("i++: " + i++); // 后递增
        System.out.println("i: " + i);
        System.out.println("--i: " + --i); // 前递减
        System.out.println("i--: " + i--); // 后递减
        System.out.println("i: " + i);
    }
}
