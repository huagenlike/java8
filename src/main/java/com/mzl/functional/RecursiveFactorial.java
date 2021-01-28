package com.mzl.functional;

/**
 * @ClassName： RecursiveFactorial
 * @Description：
 * @author：lhg
 * @data：2021/1/8 15:53
 * @Version：1.0
 **/
public class RecursiveFactorial {
    static IntCall fact;
    public static void main(String[] args) {
        // 这里，fact 是一个静态变量。
        // 注意使用三元 if-else。 递归函数将一直调用自己，直到 i == 0。所有递归函数都有“停止条件”，否则将无限递归并产生异常。
        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
        for(int i = 0; i <= 10; i++)
            System.out.println(fact.call(i));
    }
}
