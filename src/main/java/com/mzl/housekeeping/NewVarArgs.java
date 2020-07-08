package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/7 16:37
 * @version:
 * @modified By:
 * 有了可变参数，你就再也不用显式地编写数组语法了，当你指定参数时，编译器实际上会为你填充数组。
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj: args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Can take individual elements:
        printArray(47, (float) 3.14, 11.11);
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        // Or an array:
        printArray((Object[]) new Integer[] {1, 2, 3, 4});
        printArray(); // Empty list is OK
    }
}
