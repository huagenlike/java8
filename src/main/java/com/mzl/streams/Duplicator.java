package com.mzl.streams;

import java.util.stream.Stream;

/**
 * @ClassName： Duplicator
 * @Description：
 * @author：lhg
 * @data：2021/2/9 11:10
 * @Version：1.0
 * 创建包含相同对象的流，只需要传递一个生成那些对象的 lambda 到 generate() 中
 **/
public class Duplicator {
    public static void main(String[] args) {
        Stream.generate(() -> "duplicate")
                .limit(3)
                .forEach(System.out::println);
    }
}
