package com.mzl.operators;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/3 17:18
 * @version:
 * @modified By:
 * 尝试转换 float 和 double 型数据为整型数据
 */
public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int)above: " + (int)above);
        System.out.println("(int)below: " + (int)below);
        System.out.println("(int)fabove: " + (int)fabove);
        System.out.println("(int)fbelow: " + (int)fbelow);
    }
}
