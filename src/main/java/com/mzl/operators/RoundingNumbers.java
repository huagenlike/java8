package com.mzl.operators;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/3 17:18
 * @version:
 * @modified By:
 * float 和 double 类型数据的四舍五入AllOps
 *
 */
public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println(
                "Math.round(above): " + Math.round(above));
        System.out.println(
                "Math.round(below): " + Math.round(below));
        System.out.println(
                "Math.round(fabove): " + Math.round(fabove));
        System.out.println(
                "Math.round(fbelow): " + Math.round(fbelow));
    }
}
