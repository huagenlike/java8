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
        t1 = t2;
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 27;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 20;
        t2.level = 30;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
}
