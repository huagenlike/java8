package com.mzl.housekeeping;

/**
 * @description: 可变参数列表与自动装箱可以和谐共处
 * @author: lhg
 * @date: Created in 2020/7/7 16:47
 * @version:
 * @modified By:
 */
public class AutoboxingVarargs {
    public static void f(Integer... args) {
        for (Integer i: args) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, 2);
        f(4, 5, 6, 7, 8, 9);
        f(10, 11, 12);

    }
}
