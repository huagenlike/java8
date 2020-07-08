package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/7 16:15
 * @version:
 * @modified By:
 * 所有的数组（无论是对象数组还是基本类型数组）都有一个固定成员 length，告诉你这个数组有多少个元素，你不能对其修改。
 */
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        // 复制了一个引用，a2 在后面被赋给另一个数组
        a2 = a1;
        // 由于 a1 和 a2 是相同数组的别名，因此通过 a2 所做的修改在 a1 中也能看到。
        for (int i = 0; i < a2.length; i++) {
            a2[i] += 1;
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println("a1[" + i + "] = " + a1[i]);
        }
    }
}
