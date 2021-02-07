package com.mzl.functional;

/**
 * @ClassName： RecursiveFibonacci
 * @Description： 将 Fibonacci 序列改为使用递归 Lambda 表达式来实现，这次使用实例变量
 * @author：lhg
 * @data：2021/1/27 9:43
 * @Version：1.0
 **/
public class RecursiveFibonacci {
    IntCall fib;

    /**
     * 无参构造方法内，用匿名函数实现了 IntCall 的方法
     * 0    0    0
     * 1    1   1
     * 2    1   1 + 0 + 0
     * 3    2   1 + 1
     * 4    3
     * 5    5
     * 6    8
     * 7    13
     * 8    21
     * 9    34
     * 10   55
     */
    RecursiveFibonacci() {
        fib = n -> {
            return n == 0 ? 0 : n == 1 ? 1 : fib.call(n - 1) + fib.call(n - 2);
        };
    }

    int fibonacci(int n) { return fib.call(n); }

    public static void main(String[] args) {
        RecursiveFibonacci rf = new RecursiveFibonacci();
        for(int i = 0; i <= 10; i++)
            System.out.println(rf.fibonacci(i));
    }
}
