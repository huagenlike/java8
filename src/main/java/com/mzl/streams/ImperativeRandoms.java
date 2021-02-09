package com.mzl.streams;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @ClassName： ImperativeRandoms
 * @Description： 命令式编程
 * @author：lhg
 * @data：2021/2/9 10:00
 * @Version：1.0
 **/
public class ImperativeRandoms {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> rints = new TreeSet<>();
        while(rints.size() < 7) {
            int r = rand.nextInt(20);
            if(r < 5) continue;
            rints.add(r);
        }
        System.out.println(rints);
    }
}
