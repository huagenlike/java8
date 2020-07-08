package com.mzl.housekeeping;

/**
 * @description: 可变参数列表
 * @author: lhg
 * @date: Created in 2020/7/7 16:32
 * @version:
 * @modified By:
 */
class A{}

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
    }

    public static void main(String[] args) {
        printArray(new Object[] {47, (float) 3.14, 11.11});
        System.out.println();
        printArray(new Object[] {"one", "two", "three", "four", "five", "six"});
        System.out.println();
        printArray(new Object[] {new A(), new A(), new A(), new A()});
    }
}
