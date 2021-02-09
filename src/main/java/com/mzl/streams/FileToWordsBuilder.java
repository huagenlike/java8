package com.mzl.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @ClassName： FileToWordsBuilder
 * @Description： 流的建造者模式
 * @author：lhg
 * @data：2021/2/9 11:47
 * @Version：1.0
 **/
public class FileToWordsBuilder {
    Stream.Builder<String> builder = Stream.builder();

    // 构造器会添加文件中的所有单词（除了第一行，它是包含文件路径信息的注释），但是其并没有调用 build()。
    // 只要你不调用 stream() 方法，就可以继续向 builder 对象中添加单词。
    public FileToWordsBuilder(String filePath) throws Exception {
        Files.lines(Paths.get(filePath))
                .skip(1) // 略过开头的注释行
                .forEach(line -> {
                    for (String w : line.split("[ .?,]+"))
                        builder.add(w);
                });
    }

    Stream<String> stream() {
        return builder.build();
    }

    public static void main(String[] args) throws Exception {
//        new FileToWordsBuilder("D:\\work\\java\\learn\\java8\\src\\main\\resources\\Cheese.dat")
//                .stream()
//                .limit(7)
//                .map(w -> w + " ")
//                .forEach(System.out::print);

        System.out.println("aa".equals("aa1"));
    }
}
