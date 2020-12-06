package com.mzl.collections;

import java.util.*;

/**
 * @ClassName： PrintingCollections
 * @Description：
 * @author：lhg
 * @data：2020/12/4 11:12
 * @Version：1.0
 * Collections print themselves automatically
 *  List ，它以特定的顺序保存一组元素；
 *  Set ，其中元素不允许重复；
 *  Queue ，只能在集合一端插入对象，并从另一端移除对象（就本例而言，这只是查看序列的另一种方式，因此并没有显示它）。
 *  Map 在每个槽中存放了两个元素，即键和与之关联的值。
 **/
public class PrintingCollections {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }
    public static void main(String[] args) {
        // ArrayList 和 LinkedList 都是 List 的类型，从输出中可以看出，它们都按插入顺序保存元素。
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new LinkedList<>()));
        // HashSet ， TreeSet 和 LinkedHashSet 是 Set 的类型。
        // HashSet 使用相当复杂的方法存储元素。现在只需要知道，这种技术是检索元素的最快方法，因此，存储顺序看上去没有什么意义（通常只关心某事物是否是 Set 的成员，而存储顺序并不重要）
        System.out.println(fill(new HashSet<>()));
        // TreeSet ，它将按比较结果的升序保存对象
        System.out.println(fill(new TreeSet<>()));
        // LinkedHashSet ，它按照被添加的先后顺序保存对象
        System.out.println(fill(new LinkedHashSet<>()));
        // Map （也称为关联数组）使用键来查找对象，就像一个简单的数据库。
        // HashMap 中的顺序不是插入顺序，因为 HashMap 实现使用了非常快速的算法来控制顺序。
        System.out.println(fill(new HashMap<>()));
        // TreeMap 通过比较结果的升序来保存键，
        System.out.println(fill(new TreeMap<>()));
        // LinkedHashMap 在保持 HashMap 查找速度的同时按键的插入顺序保存键。
        System.out.println(fill(new LinkedHashMap<>()));
    }
}
