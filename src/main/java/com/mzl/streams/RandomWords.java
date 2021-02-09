package com.mzl.streams;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.io.*;
import java.nio.file.*;

/**
 * @ClassName： RandomWords
 * @Description：
 * @author：lhg
 * @data：2021/2/9 10:27
 * @Version：1.0
 **/
public class RandomWords implements Supplier<String> {
    List<String> words = new ArrayList<>();
    Random rand = new Random(47);
    RandomWords(String fname) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fname));
        // 略过第一行
        // subList(fromIndex, toIndex)返回此列表中指定的fromIndex （包括）和toIndex （不包括）之间的视图。
        for (String line : lines.subList(1, lines.size())) {
            // 在构造器中，每一行都被 split() 通过空格或者被方括号包裹的任意标点符号进行分割。
            // 在结束方括号后面的 + 代表 + 前面的东西可以出现一次或者多次。
            for (String word : line.split("[ .?,]+"))
                words.add(word.toLowerCase());
        }
    }
    public String get() {
        return words.get(rand.nextInt(words.size()));
    }
    @Override
    public String toString() {
        //  Collectors.joining()，你将会得到一个 String 类型的结果，每个元素都根据 joining() 的参数来进行分割。
        //  还有许多不同的 Collectors 用于产生不同的结果。
        return words.stream()
                .collect(Collectors.joining(" "));
    }
    public static void main(String[] args) throws Exception {
        // Stream.generate() 的用法，它可以把任意 Supplier<T> 用于生成 T 类型的流。
        // public static<T> Stream<T> generate(Supplier<T> s)
        System.out.println(
                Stream.generate(new RandomWords("D:\\work\\java\\learn\\java8\\src\\main\\resources\\Cheese.dat"))
                        .limit(10)
                        .collect(Collectors.joining(" ")));
        // public static<T> Stream<T> of(T t)
        // TODO 下面的为什么会报错？？
        /*System.out.println(
                Stream.of(new RandomWords("D:\\work\\java\\learn\\java8\\src\\main\\resources\\Cheese.dat"))
                        .limit(10)
                        .collect(Collectors.joining(" ")));*/
    }
}
