package com.mzl.collections;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @program: java8
 * @description:
 * @author: may
 * @create: 2020-12-06 11:21
 **/
public class UniqueWords {
    public static void main(String[] args) throws Exception {
        // 读取文件中的所有行。 使用UTF-8 charset将文件中的字节解码为charset 。
        List<String> lines = Files.readAllLines(Paths.get("SetOperations.java"));
        // 因为它是 TreeSet ，所以对结果进行排序。这里，排序是按字典顺序（lexicographically）完成的，因此大写和小写字母位于不同的组中。
        Set<String> words = new TreeSet<>();
        for(String line : lines)
            // 使用正则表达式 \\ W + ，这意味着它会依据一个或多个（即 + ）非单词字母来拆分字符串（正则表达式将在字符串章节介绍）。
            for(String word : line.split("\\W+"))
                if(word.trim().length() > 0)
                    words.add(word);
        System.out.println(words);
    }
}
