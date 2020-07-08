package com.mzl.operators;

/**
 * @description: 类型转换
 * @author: lhg
 * @date: Created in 2020/7/3 17:12
 * @version:
 * @modified By:
 * 若将数据类型进行“向下转换”（Narrowing Conversion）的操作（将容量较大的数据类型转换成容量较小的类型），可能会发生信息丢失的危险。
 */
public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long)i;
        lng = i; // 没有必要的类型提升
        long lng2 = (long)200;
        lng2 = 200;
        // 类型收缩
        i = (int)lng2; // Cast required
    }
}
