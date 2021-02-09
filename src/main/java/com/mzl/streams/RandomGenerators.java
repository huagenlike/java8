package com.mzl.streams;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @ClassName： RandomGenerators
 * @Description： 随机数流
 * @author：lhg
 * @data：2021/2/9 10:16
 * @Version：1.0
 **/
public class RandomGenerators {
    public static <T> void show(Stream<T> stream) {
        stream.limit(4).forEach(System.out::println);
        System.out.println("++++++++++++");
    }

    public static void main(String[] args) {
        // boxed() 流操作将会自动地把基本类型包装成为对应的装箱类型，从而使得 show() 能够接受流
        Random rand = new Random(47);
        show(rand.ints().boxed());
        show(rand.longs().boxed());
        show(rand.doubles().boxed());
        // 控制上限和下限：
        show(rand.ints(10, 20).boxed());
        show(rand.longs(50, 100).boxed());
        show(rand.doubles(20, 30).boxed());
        // 控制流大小：
        show(rand.ints(2).boxed());
        show(rand.longs(2).boxed());
        show(rand.doubles(2).boxed());
        // 控制流的大小和界限
        show(rand.ints(3, 3, 9).boxed());
        show(rand.longs(3, 12, 22).boxed());
        show(rand.doubles(3, 11.5, 12.3).boxed());
    }
}
