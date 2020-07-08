package com.mzl.housekeeping;

/**
 * @description: 在构造器中调用构造器
 * @author: lhg
 * @date: Created in 2020/7/6 16:34
 * @version:
 * @modified By:
 * 通常当你说 this，意味着"这个对象"或"当前对象"，它本身生成对当前对象的引用。
 * 在一个构造器中，当你给 this 一个参数列表时，它是另一层意思。
 * 它通过最直接的方式显式地调用匹配参数列表的构造器：
 * static 方法中不会存在 this。你不能在静态方法中调用非静态方法（反之可以）。静态方法是为类而创建的，不需要任何对象。
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor w/ string arg only, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        //- this(s); // Can't call two!
        // 参数列表中的变量名 s 和成员变量名 s 相同，会引起混淆。你可以通过 this.s 表明你指的是成员变量 s，从而避免重复。
        this.s = s; // Another use of "this"
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("no-arg constructor");
    }

    void printPetalCount() {
        //- this(11); // Not inside constructor!
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
