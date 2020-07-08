package com.mzl.operators;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/2 9:55
 * @version:
 * @modified By:
 */
// 正在传递的对象可能不是你之前使用的
class Letter {
    char c;
}

public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
        Letter y = new Letter();
        y.c = 'c';
        System.out.println("2: x.c: " + y.c);

    }
}
