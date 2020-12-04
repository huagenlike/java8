package com.mzl.collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName： SimpleCollection
 * @Description：
 * @author：lhg
 * @data：2020/12/4 10:57
 * @Version：1.0
 **/
public class SimpleCollection {
    public static void main(String[] args) {
        // Collection 接口概括了序列的概念——一种存放一组对象的方式。
        Collection<Integer> c = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for(Integer i : c)
            System.out.print(i + ", ");
    }
}
