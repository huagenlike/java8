package com.mzl.collections;

import java.util.*;
import java.nio.file.*;

/**
 * @program: java8
 * @description:
 * @author: may
 * @create: 2020-12-06 11:26
 * 产生字母顺序清单
 **/
public class UniqueWordsAlphabetic {
    public static void
    main(String[] args) throws Exception {
        List<String> lines = Files.readAllLines(
                Paths.get("SetOperations.java"));
        // 按字母顺序（alphabetically）对其进行排序，可以向 TreeSet 构造器传入 String.CASE_INSENSITIVE_ORDER 比较器（比较器是一个建立排序顺序的对象）：
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for(String line : lines)
            for(String word : line.split("\\W+"))
                if(word.trim().length() > 0)
                    words.add(word);
        System.out.println(words);
    }
}
