package com.mzl.collections;

import com.mzl.typeinfo.pets.*;
import java.util.*;

/**
 * @ClassName： CrossCollectionIteration
 * @Description：
 * @author：lhg
 * @data：2020/12/4 15:03
 * @Version：1.0
 **/
public class CrossCollectionIteration {
    // 现在考虑创建一个 display() 方法，它不必知晓集合的确切类型
    public static void display(Iterator<Pet> it) {
        while(it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Pet> pets = Pets.list(8);
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petsHS = new HashSet<>(pets);
        TreeSet<Pet> petsTS = new TreeSet<>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
