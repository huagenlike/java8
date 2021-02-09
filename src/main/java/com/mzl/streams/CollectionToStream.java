package com.mzl.streams;

import java.util.*;

/**
 * @ClassName： CollectionToStream
 * @Description： 调用 stream() 方法来产生一个流
 * @author：lhg
 * @data：2021/2/9 10:11
 * @Version：1.0
 **/
public class CollectionToStream {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(1), new Bubble(2), new Bubble(3));
        // 中间操作 map() 会获取流中的所有元素，并且对流中元素应用操作从而产生新的元素，并将其传递到后续的流中。
        // mapToInt() 方法将一个对象流（object stream）转换成为包含整型数字的 IntStream。同样，针对 Float 和 Double 也有类似名字的操作。
        System.out.println(bubbles.stream()
                .mapToInt(b -> b.i)
                .sum());

        Set<String> w = new HashSet<>(Arrays.asList("It's a wonderful day for pie!".split(" ")));
        w.stream()
                .map(x -> x + " ")
                .forEach(System.out::print);
        System.out.println();

        Map<String, Double> m = new HashMap<>();
        m.put("pi", 3.14159);
        m.put("e", 2.718);
        m.put("phi", 1.618);
        m.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .forEach(System.out::println);
    }
}
