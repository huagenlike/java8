package com.mzl.collections;

import com.mzl.typeinfo.pets.*;
import java.util.*;

/**
 * @ClassName： ListIteration
 * @Description：
 * @author：lhg
 * @data：2020/12/4 15:11
 * @Version：1.0
 **/
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.list(8);
        ListIterator<Pet> it = pets.listIterator();
        // 向前:
        while(it.hasNext())
            System.out.print(it.next() +
                    ", " + it.nextIndex() +
                    ", " + it.previousIndex() + "; ");
        System.out.println();
        // 向后:
        while(it.hasPrevious())
            System.out.print(it.previous().id() + " ");
        System.out.println();
        System.out.println(pets);
        // 从位置 3 开始。
        it = pets.listIterator(3);
        while(it.hasNext()) {
            it.next();
            it.set(Pets.get());
        }
        System.out.println(pets);
    }
}
