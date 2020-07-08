package com.mzl.control;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 9:46
 * @version:
 * @modified By:
 * 演示 while 循环
 */
public class WhileTest {
    static boolean condition() {
        //Math 库的静态方法 random()，该方法的作用是产生 0 和 1 之间 (包括 0，但不包括 1) 的一个 double 值
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }
    public static void main(String[] args) {
        while(condition())
            System.out.println("Inside 'while'");
        System.out.println("Exited 'while'");
    }
}
