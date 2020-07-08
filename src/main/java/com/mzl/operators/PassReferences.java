package com.mzl.operators;

/**
 * @description: 传递引用
 * @author: lhg
 * @date: Created in 2020/7/2 11:19
 * @version:
 * @modified By:
 * 当你将引用传递给方法时，它仍指向同一对象
 */
public class PassReferences {
    public static void f(PassReferences h) {
        System.out.println("h inside f(): " + h);
    }
    public static void main(String[] args) {
        PassReferences p = new PassReferences();
        System.out.println("p inside main(): " + p);
        f(p);
    }
}
