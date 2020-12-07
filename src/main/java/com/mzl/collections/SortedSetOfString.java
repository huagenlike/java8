package com.mzl.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * @program: java8
 * @description:
 * @author: may
 * @create: 2020-12-06 10:33
 **/
public class SortedSetOfString {
    public static void main(String[] args) {
        // TreeSet 将元素存储在红-黑树数据结构中
        // 要对结果进行排序，一种方法是使用 TreeSet 而不是 HashSet
        Set<String> colors = new TreeSet<>();
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
