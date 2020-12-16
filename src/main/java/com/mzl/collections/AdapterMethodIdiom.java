package com.mzl.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName： AdapterMethodIdiom
 * @Description：
 * @author：lhg
 * @data：2020/12/16 11:14
 * @Version：1.0
 **/
class ReversibleArrayList<T> extends ArrayList<T> {
    ReversibleArrayList(Collection<T> c) {
        super(c);
    }

    // 反向迭代
    public Iterable<T> reversed() {
        return new Iterable<T>() {
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    public boolean hasNext() {
                        return current > -1;
                    }
                    public T next() { return get(current--); }
                    public void remove() { // Not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    // 在主方法中，如果直接将 ral 对象放在 for-in 语句中，则会得到（默认的）正向迭代器。
    // 但是如果在该对象上调用 reversed() 方法，它会产生不同的行为。
    public static void main(String[] args) {
        ReversibleArrayList<String> ral =
                new ReversibleArrayList<String>(Arrays.asList("To be or not to be".split(" ")));
        // 通过迭代器获取普通迭代器:
        for(String s : ral)
            System.out.print(s + " ");
        System.out.println();
        // 交给您选择的迭代
        for(String s : ral.reversed())
            System.out.print(s + " ");
    }
}