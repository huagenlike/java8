package com.mzl.housekeeping;

import java.util.Arrays;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/7 16:26
 * @version:
 * @modified By:
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                1, 2,
                3, // Autoboxing
        };
        Integer[] b = new Integer[] {
                1, 2,
                3, // Autoboxing
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
