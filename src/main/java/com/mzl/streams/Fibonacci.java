package com.mzl.streams;

import java.util.stream.Stream;

/**
 * @ClassName： Fibonacci
 * @Description：
 * @author：lhg
 * @data：2021/2/9 11:16
 * @Version：1.0
 **/
public class Fibonacci {
    int x = 1;

    // iterate() 只能记忆结果，因此我们需要利用一个变量 x 追踪另外一个元素。
    Stream<Integer> numbers() {
        return Stream.iterate(0, i -> {
            int result = x + i;
            x = i;
            return result;
        });
    }

    public static void main(String[] args) {
        new Fibonacci().numbers()
                .skip(20) // 过滤前 20 个
                .limit(10) // 然后取 10 个
                .forEach(System.out::println);
    }
}
