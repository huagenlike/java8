package com.mzl.operators;

/**
 * @description: 字面值常量
 * @author: lhg
 * @date: Created in 2020/7/3 16:16
 * @version:
 * @modified By:
 * 对于 Long 型数值，结尾使用大写 L 或小写 l 皆可（不推荐使用 l，因为容易与阿拉伯数值 1 混淆）。大写 F 或小写 f 表示 float 浮点数。大写 D 或小写 d 表示 double 双精度
 * 十六进制（以 16 为基数），适用于所有整型数据类型，由前导 0x 或 0X 表示，后跟 0-9 或 a-f （大写或小写）。
 * 八进制（以 8 为基数）由 0~7 之间的数字和前导零 0 表示。
 * Java 7 引入了二进制的字面值常量，由前导 0b 或 0B 表示，它可以初始化所有的整数类型。
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // 16进制 (小写)
        System.out.println(
                "i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F; // 16进制 (大写)
        System.out.println(
                "i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // 8进制 (前导0)
        System.out.println(
                "i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // 最大 char 型16进制值
        System.out.println(
                "c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // 最大 byte 型16进制值  10101111;
        System.out.println(
                "b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // 最大 short 型16进制值
        System.out.println(
                "s: " + Integer.toBinaryString(s));
        long n1 = 200L; // long 型后缀
        long n2 = 200l; // long 型后缀 (容易与数值1混淆)
        long n3 = 200;

        // Java 7 二进制字面值常量:
        byte blb = (byte)0b00110101;
        System.out.println(
                "blb: " + Integer.toBinaryString(blb));
        short bls = (short)0B0010111110101111;
        System.out.println(
                "bls: " + Integer.toBinaryString(bls));
        int bli = 0b00101111101011111010111110101111;
        System.out.println(
                "bli: " + Integer.toBinaryString(bli));
        long bll = 0b00101111101011111010111110101111;
        System.out.println(
                "bll: " + Long.toBinaryString(bll));
        float f1 = 1;
        float f2 = 1F; // float 型后缀
        float f3 = 1f; // float 型后缀
        double d1 = 1d; // double 型后缀
        double d2 = 1D; // double 型后缀
        // (long 型的字面值同样适用于十六进制和8进制 )
    }
}
