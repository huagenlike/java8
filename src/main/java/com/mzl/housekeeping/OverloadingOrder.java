package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 15:52
 * @version:
 * @modified By:
 */
public class OverloadingOrder {
    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        f("String first", 1);
        f(99, "Int first");
    }
}
