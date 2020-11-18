package com.mzl.innerclasses;

/**
 * @ClassName： Sequence
 * @Description： 链接外部类
 * @author：lhg
 * @data：2020/11/18 15:45
 * @Version：1.0
 **/
// “迭代器”设计模式的一个例子
interface Selector {
    boolean end();
    Object current();
    void next();
}
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if(next < items.length)
            // 利用了a++，先返回，后运算的特性，nice
            items[next++] = x;
    }
    // 内部类自动拥有对其外部类所有成员的访问权。这是如何做到的呢？
    // 当某个外部类的对象创建了一个内部类对象时，此内部类对象必定会秘密地捕获一个指向那个外部类对象的引用。
    // 然后，在你访问此外部类的成员时，就是用那个引用来选择外部类的成员。
    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() { return i == items.length; }
        @Override
        public Object current() { return items[i]; }
        @Override
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
