package com.mzl.collections;

import java.util.*;

/**
 * @program: java8
 * @description: 映射Map
 * @author: may
 * @create: 2020-12-06 12:00
 * 我们不保证此代码适用于任何目的。
 * Visit http://OnJava8.com for more book information.
 * HashMap的简单演示
 **/
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r); // [1]
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
