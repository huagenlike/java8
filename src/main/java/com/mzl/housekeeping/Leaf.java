package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 16:24
 * @version:
 * @modified By:
 */
public class Leaf {

    int i = 0;

    Leaf increment() {
        i++;
        // return 语句中返回对当前对象的引用
        // 因为 increment() 通过 this 关键字返回当前对象的引用，因此在相同的对象上可以轻易地执行多次操作
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
