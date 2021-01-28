package com.mzl.functional;

import java.util.function.BiConsumer;

/**
 * @ClassName： BiConsumerPermutations
 * @Description：
 * @author：lhg
 * @data：2021/1/28 11:12
 * @Version：1.0
 * 使用了包装类型，装箱和拆箱用于在基本类型之间来回转换
 **/
public class BiConsumerPermutations {
    // %f 表示我将 n 作为浮点值给出，%d 表示 n 是一个整数值。
    // 这其中可以包含空格，输入 %n 会换行 — 当然使用传统的 \n 也能换行，但 %n 是自动跨平台的，这是使用 format() 的另一个原因。
    static BiConsumer<Integer, Double> bicid = (i, d) -> System.out.format("%d, %f%n", i, d);
    static BiConsumer<Double, Integer> bicdi = (d, i) -> System.out.format("%d, %f%n", i, d);
    static BiConsumer<Integer, Long> bicil = (i, l) -> System.out.format("%d, %d%n", i, l);
    public static void main(String[] args) {
        // accept(T t, U u) 对给定的参数执行此操作
        bicid.accept(47, 11.34);
        bicdi.accept(22.45, 92);
        bicil.accept(1, 11L);
    }
}
