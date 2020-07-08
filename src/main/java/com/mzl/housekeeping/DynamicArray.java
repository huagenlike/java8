package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/7 16:28
 * @version:
 * @modified By:
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[] {"fiddle", "de", "dum"});
    }
}

class Other {
    public static void main(String[] args) {
        for (String s: args) {
            System.out.print(s + " ");
        }
    }
}
