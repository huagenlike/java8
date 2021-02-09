package com.mzl.streams;

import static com.mzl.streams.Repeat.repeat;

/**
 * @ClassName： Looping
 * @Description：
 * @author：lhg
 * @data：2021/2/9 11:03
 * @Version：1.0
 **/
public class Looping {
    static void hi() {
        System.out.println("Hi!");
    }
    public static void main(String[] args) {
        repeat(3, () -> System.out.println("Looping!"));
        repeat(2, Looping::hi);
    }
}
