package com.mzl.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @program: java8
 * @description:
 * @author: may
 * @create: 2020-12-06 10:29
 **/
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for(int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
    }
}