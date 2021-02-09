package com.mzl.streams;

/**
 * @ClassName： Bubble
 * @Description：
 * @author：lhg
 * @data：2021/2/9 10:09
 * @Version：1.0
 **/
public class Bubble {
    public final int i;

    public Bubble(int n) { i = n; }

    @Override
    public String toString() {
        return "Bubble(" + i + ")";
    }

    private static int count = 0;

    // 静态生成器（Static generator）方法
    public static Bubble bubbler() {
        return new Bubble(count++);
    }
}
