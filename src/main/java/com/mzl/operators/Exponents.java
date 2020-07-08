package com.mzl.operators;

/**
 * @description: 指数计数法
 * @author: lhg
 * @date: Created in 2020/7/3 16:44
 * @version:
 * @modified By:
 * "e" 表示 10 的几次幂
 */
public class Exponents {
    public static void main(String[] args) {
        // 大写 E 和小写 e 的效果相同:
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d; // 'd' 是可选的
        double expDouble2 = 47e47; // 自动转换为 double
        System.out.println(expDouble);
    }
}
