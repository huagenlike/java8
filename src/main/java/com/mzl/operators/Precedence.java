package com.mzl.operators;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/2 9:45
 * @version:
 * @modified By:
 */
public class Precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2/2 + z; // [1]
        int b = x + (y - 2)/(2 + z); // [2]
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
