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
        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
        for(int i = 0; i <= 10; i++)
            System.out.println(fact.call(i));
    }
}
