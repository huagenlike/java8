package com.mzl.functional;

import java.util.function.BiFunction;

/**
 * @ClassName： TriFunctionTest
 * @Description： 多参数函数式接口
 * @author：lhg
 * @data：2021/1/28 11:05
 * @Version：1.0
 **/
public class TriFunctionTest {
    static int f(int i, long l, double d) { return 99; }
    static int c(int i, long l) { return 66; }
    public static void main(String[] args) {
        TriFunction<Integer, Long, Double, Integer> tf = TriFunctionTest::f;
        // 表示一个接受两个参数并产生结果的函数。 这是Function的两面专业。
        // 这是一个功能接口，其功能方法为apply(Object, Object) 。
        BiFunction<Integer, Long, Integer> c = TriFunctionTest::c;
        tf = (i, l, d) -> 12;
    }
}
