package com.mzl.collections;

import com.mzl.typeinfo.pets.*;
import java.util.*;

/**
 * @ClassName： LinkedListFeatures
 * @Description：
 * @author：lhg
 * @data：2020/12/4 15:29
 * @Version：1.0
 **/
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.list(5));
        System.out.println(pets);
        // Identical:
        // getFirst() 返回此列表中的第一个元素。
        System.out.println("pets.getFirst(): " + pets.getFirst());
        // element() 检索但不删除此列表的头（第一个元素）
        System.out.println("pets.element(): " + pets.element());
        // 仅空列表行为有所不同:
        // peek() 检索但不删除此列表的头（第一个元素）
        System.out.println("pets.peek(): " + pets.peek());
        // 相同;
        // 检索并删除此列表的头（第一个元素）:
        System.out.println("pets.remove(): " + pets.remove());
        // 从此列表中删除并返回第一个元素
        System.out.println("pets.removeFirst(): " + pets.removeFirst());
        // 仅空列表行为有所不同:
        // 检索并删除此列表的头（第一个元素）
        System.out.println("pets.poll(): " + pets.poll());
        System.out.println(pets);
        // 将指定的元素插入此列表的开头
        pets.addFirst(new Rat());
        System.out.println("After addFirst(): " + pets);
        // 将指定的元素添加为此列表的尾部（最后一个元素）
        pets.offer(Pets.get());
        System.out.println("After offer(): " + pets);
        // 将指定的元素追加到此列表的末尾 。此方法等效于addLast 。
        pets.add(Pets.get());
        System.out.println("After add(): " + pets);
        // 将指定的元素追加到此列表的末尾。此方法等效于add 。
        pets.addLast(new Hamster());
        System.out.println("After addLast(): " + pets);
        // 从此列表中删除并返回最后一个元素
        System.out.println("pets.removeLast(): " + pets.removeLast());
    }
}
