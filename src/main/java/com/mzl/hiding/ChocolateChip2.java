package com.mzl.hiding;

import com.mzl.hiding.cookie2.Cookie;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/8 15:28
 * @version:
 * @modified By:
 */
public class ChocolateChip2 extends Cookie {
    public ChocolateChip2() {
        System.out.println("ChocolateChip2 constructor");
    }

    public void chomp() {
        bite(); // Protected method
    }

    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
}
