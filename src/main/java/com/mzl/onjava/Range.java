package com.mzl.onjava;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 10:41
 * @version:
 * @modified By:
 * for-in 语法可以节省我们编写代码的时间。 更重要的是，它提高了代码可读性以及更好地描述代码意图（获取数组的每个元素）而不是详细说明这操作细节（创建索引，并用它来选择数组元素） 本书推荐使用 for-in 语法。
 */
public class Range {
    // Produce a sequence [0..n)
    public static int[] range(int n) {
        int[] result = new int[n];
        for(int i = 0; i < n; i++)
            result[i] = i;
        return result;
    }
    // Produce a sequence [start..end)
    public static int[] range(int start, int end) {
        int sz = end - start;
        int[] result = new int[sz];
        for(int i = 0; i < sz; i++)
            result[i] = start + i;
        return result;
    }
    // Produce sequence [start..end) incrementing by step
    public static int[] range(int start, int end, int step) {
        int sz = (end - start)/step;
        int[] result = new int[sz];
        for(int i = 0; i < sz; i++)
            result[i] = start + (i * step);
        return result;
    }
}
