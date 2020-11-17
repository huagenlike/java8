package com.mzl.interfaces;

/**
 * @ClassName： AnImplementation
 * @Description：
 * @author：lhg
 * @data：2020/11/17 11:07
 * @Version：1.0
 **/
public class AnImplementation implements AnInterface {
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        AnInterface i = new AnImplementation();
        i.firstMethod();
        i.secondMethod();
    }
}
