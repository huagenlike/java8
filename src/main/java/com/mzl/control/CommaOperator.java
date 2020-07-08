package com.mzl.control;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 9:51
 * @version:
 * @modified By:
 */
public class CommaOperator {
    public static void main(String[] args) {
        for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
