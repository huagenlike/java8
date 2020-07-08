package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/7 16:52
 * @version:
 * @modified By:
 */
public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        // 因为 Character 字符'a' 可以向上转型成 long 类型，所以两个方法都匹配，会报错
        //f('a', 'b');
    }
}
