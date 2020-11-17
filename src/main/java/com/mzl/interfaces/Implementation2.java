package com.mzl.interfaces;

/**
 * @ClassName： Implementation2
 * @Description：
 * @author：lhg
 * @data：2020/11/17 11:21
 * @Version：1.0
 **/
public class Implementation2 implements InterfaceWithDefault {
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    /*@Override
    public void newMethod() {
        System.out.println("newMethodImpl");
    }*/

    public static void main(String[] args) {
        InterfaceWithDefault i = new Implementation2();
        i.firstMethod();
        i.secondMethod();
        i.newMethod();
    }
}
