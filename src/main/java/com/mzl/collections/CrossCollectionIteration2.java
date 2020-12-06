package com.mzl.collections;

import com.mzl.typeinfo.pets.*;
import java.util.*;

/**
 * @ClassName： CrossCollectionIteration2
 * @Description：
 * @author：lhg
 * @data：2020/12/4 15:06
 * @Version：1.0
 **/
public class CrossCollectionIteration2 {
    // 可以使用 Iterable 接口生成上一个示例的更简洁版本，该接口描述了“可以产生 Iterator 的任何东西”：
    // Collection 继承了 Iterable，所以直接放集合即可用
    public static void display(Iterable<Pet> ip) {
        Iterator<Pet> it = ip.iterator();
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
        display(pets);
        display(petsLL);
        display(petsHS);
        display(petsTS);
    }
}