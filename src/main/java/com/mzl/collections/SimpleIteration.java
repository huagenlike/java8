package com.mzl.collections;

import com.mzl.typeinfo.pets.*;
import java.util.*;

/**
 * @ClassName： SimpleIteration
 * @Description：
 * @author：lhg
 * @data：2020/12/4 14:54
 * @Version：1.0
 **/
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.list(12);
        // 有了 Iterator ，就不必再为集合中元素的数量操心了。这是由 hasNext() 和 next() 关心的事情。
        Iterator<Pet> it = pets.iterator();
        while(it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
        // 如果可能的话，一种更简单的方法:
        for(Pet p : pets)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();
        // 迭代器还可以删除元素:
        it = pets.iterator();
        for(int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
