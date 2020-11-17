package com.mzl.interfaces;

/**
 * @ClassName： MultipleInheritance
 * @Description： 多继承
 * @author：lhg
 * @data：2020/11/17 11:43
 * @Version：1.0
 **/
interface One {
    default void first() {
        System.out.println("first");
    }
}

interface Two {
    default void second() {
        System.out.println("second");
    }
}

interface Three {
    default void third() {
        System.out.println("third");
    }
}

// 通过默认方法具有了某种多继承的特性
class MI implements One, Two, Three {}

public class MultipleInheritance {
    public static void main(String[] args) {
        MI mi = new MI();
        mi.first();
        mi.second();
        mi.third();
    }
}
