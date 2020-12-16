package com.mzl.collections;

import java.util.*;

/**
 * @ClassName： ForInCollections
 * @Description：
 * @author：lhg
 * @data：2020/12/16 11:08
 * @Version：1.0
 **/
public class ForInCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, "Take the long way home".split(" "));
        for(String s : cs)
            System.out.print("'" + s + "' ");
    }
}
