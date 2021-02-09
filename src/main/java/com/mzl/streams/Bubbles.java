package com.mzl.streams;

import java.util.stream.Stream;

/**
 * @ClassName： Bubbles
 * @Description：
 * @author：lhg
 * @data：2021/2/9 11:13
 * @Version：1.0
 **/
public class Bubbles {
    public static void main(String[] args) {
        Stream.generate(Bubble::bubbler)
                .limit(5)
                .forEach(System.out::println);
    }
}
