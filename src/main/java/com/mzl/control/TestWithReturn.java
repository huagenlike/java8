package com.mzl.control;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 10:52
 * @version:
 * @modified By:
 * return 关键字有两方面的作用：
 *      1.指定一个方法返回值 (在方法返回类型非 void 的情况下)；
 *      2.退出当前方法，并返回作用 1 中值。
 */
public class TestWithReturn {
    static int test(int testval, int target) {
        if(testval > target)
            return +1;
        if(testval < target)
            return -1;
        return 0; // Match
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println(test(5, 10));
        System.out.println(test(5, 5));
    }
}
