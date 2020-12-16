package com.mzl.collections;

import java.util.*;

/**
 * @ClassName： AddingGroups
 * @Description：
 * @author：lhg
 * @data：2020/12/4 10:59
 * @Version：1.0
 * 将元素组添加到集合对象
 **/
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = { 6, 7, 8, 9, 10 };
        collection.addAll(Arrays.asList(moreInts));
        // 运行速度明显加快，但是您不能通过以下方式构造Collection：
        // Collections.addAll() 运行得更快，而且很容易构建一个不包含元素的 Collection
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        // 产生一个由数组“支持”的列表：
        // 直接使用 Arrays.asList() 的输出作为一个 List ，但是这里的底层实现是数组，没法调整大小。
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1, 99); // OK -- 修改元素
        // list.add(21); // Runtime error; the underlying
        // array cannot be resized.
    }
}