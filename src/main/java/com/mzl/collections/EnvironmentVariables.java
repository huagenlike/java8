package com.mzl.collections;

import java.util.Map;

/**
 * @ClassName： EnvironmentVariables
 * @Description：
 * @author：lhg
 * @data：2020/12/16 11:11
 * @Version：1.0
 **/
public class EnvironmentVariables {
    public static void main(String[] args) {
        // System.getenv() 返回一个 Map ， entrySet() 产生一个由 Map.Entry 的元素构成的 Set ，并且这个 Set 是一个 Iterable ，因此它可以用于 for-in 循环。
        for(Map.Entry entry: System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
