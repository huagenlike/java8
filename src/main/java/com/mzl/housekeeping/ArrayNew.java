package com.mzl.housekeeping;

import java.util.Arrays;
import java.util.Random;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/7 16:18
 * @version:
 * @modified By:
 * 数组元素中的基本数据类型值会自动初始化为默认值（对于数字和字符是 0；对于布尔型是 false）
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random random = new Random(47);
        a = new int[random.nextInt(20)];
        System.out.println("length of a=" + a.length);
        System.out.println(Arrays.toString(a));
    }
}
