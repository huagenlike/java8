package com.mzl.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: java8
 * @description:
 * @author: may
 * @create: 2020-12-06 10:33
 **/
public class SetOfString {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        for(int i = 0; i < 100; i++) {
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Red");
            colors.add("Red");
            colors.add("Orange");
            colors.add("Yellow");
            colors.add("Blue");
            colors.add("Purple");
        }
        System.out.println(colors);
    }
}