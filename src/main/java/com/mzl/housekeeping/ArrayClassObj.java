package com.mzl.housekeeping;

import java.util.Arrays;
import java.util.Random;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/7 16:23
 * @version:
 * @modified By:
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];
        System.out.println("length of a=" + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(500);
        }
        System.out.println(Arrays.toString(a));
    }
}
