package com.mzl.control;

import static com.mzl.onjava.Range.range;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 10:43
 * @version:
 * @modified By:
 */
public class ForInInt {
    public static void main(String[] args) {
        for(int i : range(10)) // 0..9
            System.out.print(i + " ");
        System.out.println();
        for(int i : range(5, 10)) // 5..9
            System.out.print(i + " ");
        System.out.println();
        for(int i : range(5, 20, 3)) // 5..20 step 3
            System.out.print(i + " ");
        System.out.println();
        for(int i : range(20, 5, -3)) // Count down
            System.out.print(i + " ");
        System.out.println();
    }
}
