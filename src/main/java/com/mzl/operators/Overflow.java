package com.mzl.operators;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 9:25
 * @version:
 * @modified By:
 * 厉害了！内存溢出
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}
