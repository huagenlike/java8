package com.mzl.collections;

import java.util.*;

/**
 * @ClassName： ModifyingArraysAsList
 * @Description：
 * @author：lhg
 * @data：2020/12/16 11:20
 * @Version：1.0
 **/
public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] ia = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> list1 = new ArrayList<>(Arrays.asList(ia));
        System.out.println("Before shuffling: " + list1);
        Collections.shuffle(list1, rand);
        System.out.println("After shuffling: " + list1);
        System.out.println("array: " + Arrays.toString(ia));

        // Arrays.asList() 的输出被传递给了 ArrayList 的构造器，这将创建一个引用 ia 的元素的 ArrayList ，因此打乱这些引用不会修改该数组。
        // 但是，如果直接使用 Arrays.asList(ia) 的结果，这种打乱就会修改 ia 的顺序。重要的是要注意 Arrays.asList() 生成一个 List 对象，该对象使用底层数组作为其物理实现。如果执行的操作会修改这个 List ，并且不希望修改原始数组，那么就应该在另一个集合中创建一个副本。
        List<Integer> list2 = Arrays.asList(ia);
        System.out.println("Before shuffling: " + list2);
        Collections.shuffle(list2, rand);
        System.out.println("After shuffling: " + list2);
        System.out.println("array: " + Arrays.toString(ia));
    }
}
