package com.mzl.streams;

import static java.util.stream.IntStream.*;

/**
 * @ClassName： Ranges
 * @Description： int 类型的范围
 * @author：lhg
 * @data：2021/2/9 10:58
 * @Version：1.0
 * IntStream 类提供了 range() 方法用于生成整型序列的流。编写循环时，这个方法会更加便利：
 **/
public class Ranges {
    public static void main(String[] args) {
        // 传统方法:
        int result = 0;
        for (int i = 10; i < 20; i++)
            result += i;
        System.out.println(result);
        // for-in 循环: 使用 range() 创建了流并将其转化为数组，然后在 for-in 代码块中使用
        result = 0;
        for (int i : range(10, 20).toArray())
            result += i;
        System.out.println(result);
        // 使用流:
        System.out.println(range(10, 20).sum());
    }
}
