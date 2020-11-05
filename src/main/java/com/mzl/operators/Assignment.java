package com.mzl.operators;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/2 9:47
 * @version:
 * @modified By:
 * 基本类型的赋值都是直接的，而不像对象，赋予的只是其内存的引用。
 * 举个例子，a = b ，如果 b 是基本类型，那么赋值操作会将 b 的值复制一份给变量 a， 此后若 a 的值发生改变是不会影响到 b 的。
 */
class Tank {
    int level;
}

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        // t2 赋值给 t1，对象的赋值是引用赋值，t1 和 t2 此时指向的是堆中同一个对象（t1 原始对象的引用在 t2 赋值给其时丢失，它引用的对象会在垃圾回收时被清理）
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        // 因为t1 t2是同一个对象，所以 t1.level 和 t2.level 实际上是
        t1.level = 27;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
        // 因为t1 t2是同一个对象，所以改 t1.level 的值，再改 t2.level 的值，实际上就是覆盖了 t2的值打印出来也会是变更后的值
        t1.level = 10;
        t2.level = 30;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}
