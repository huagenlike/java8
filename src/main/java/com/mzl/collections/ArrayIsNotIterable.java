package com.mzl.collections;

import java.util.Arrays;

/**
 * @ClassName： ArrayIsNotIterable
 * @Description：
 * @author：lhg
 * @data：2020/12/16 11:12
 * @Version：1.0
 **/
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for(T t : ib)
            System.out.print(t + " ");
    }
    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = { "A", "B", "C" };
        // 数组可在for-in中使用，但不可迭代:
        //- test(strings);
        // 您必须将其显式转换为Iterable:
        test(Arrays.asList(strings));
    }
}