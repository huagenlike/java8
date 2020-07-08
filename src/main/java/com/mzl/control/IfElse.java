package com.mzl.control;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 9:39
 * @version:
 * @modified By:
 */
public class IfElse {
    static int result = 0;
    static void test(int testval, int target) {
        if(testval > target)
            result = +1;
        else if(testval < target) // [1]
            result = -1;
        else
            result = 0; // Match
    }

    public static void main(String[] args) {
        test(10, 5);
        System.out.println(result);
        test(5, 10);
        System.out.println(result);
        test(5, 5);
        System.out.println(result);
    }
}
