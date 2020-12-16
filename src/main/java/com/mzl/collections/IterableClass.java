package com.mzl.collections;

import java.util.Iterator;

/**
 * @ClassName： IterableClass
 * @Description：
 * @author：lhg
 * @data：2020/12/16 11:09
 * @Version：1.0
 **/
public class IterableClass implements Iterable<String> {
    protected String[] words = ("And that is how we know the Earth to be banana-shaped.").split(" ");

    // iterator() 返回的是实现了 Iterator<String> 的匿名内部类的实例，该匿名内部类可以遍历数组中的每个单词。
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }
            @Override
            public String next() { return words[index++]; }
            @Override
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args) {
        for(String s : new IterableClass())
            System.out.print(s + " ");
    }
}