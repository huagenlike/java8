package com.mzl.streams;

import java.util.stream.Stream;

/**
 * @ClassName： StreamOf
 * @Description： 创建流
 * @author：lhg
 * @data：2021/2/9 10:06
 * @Version：1.0
 **/
public class StreamOf {
    public static void main(String[] args) {
        Stream.of(new Bubble(1), new Bubble(2), new Bubble(3))
                .forEach(System.out::println);
        Stream.of("It's ", "a ", "wonderful ", "day ", "for ", "pie!")
                .forEach(System.out::print);
        System.out.println();
        Stream.of(3.14159, 2.718, 1.618)
                .forEach(System.out::println);
    }
}
