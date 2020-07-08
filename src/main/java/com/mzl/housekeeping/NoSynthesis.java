package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 16:17
 * @version:
 * @modified By:
 */
class Bird2 {
    Bird2(int i) {}
    Bird2(double d) {}
}
public class NoSynthesis {
    public static void main(String[] args) {
        //- Bird2 b = new Bird2(); // No default
        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.0);
    }
}
