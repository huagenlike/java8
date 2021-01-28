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

    RecursiveFibonacci() {
        fib = n -> n == 0 ? 0 :
                n == 1 ? 1 :
                        fib.call(n - 1) + fib.call(n - 2);
    }

    int fibonacci(int n) { return fib.call(n); }

    public static void main(String[] args) {
        RecursiveFibonacci rf = new RecursiveFibonacci();
        for(int i = 0; i <= 10; i++)
            System.out.println(rf.fibonacci(i));
    }
}
