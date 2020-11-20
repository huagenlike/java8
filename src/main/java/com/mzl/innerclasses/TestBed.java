package com.mzl.innerclasses;

/**
 * @ClassName： TestBed
 * @Description：
 * @author：lhg
 * @data：2020/11/20 11:05
 * @Version：1.0
 **/
public class TestBed {
    public void f() { System.out.println("f()"); }
    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}