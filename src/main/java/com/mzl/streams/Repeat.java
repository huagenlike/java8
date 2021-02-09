package com.mzl.streams;

import static java.util.stream.IntStream.*;

/**
 * @ClassName： Repeat
 * @Description：
 * @author：lhg
 * @data：2021/2/9 11:02
 * @Version：1.0
 * 注意 IntStream.range() 相比 onjava.Range.range() 拥有更多的限制。
 * 这是由于其可选的第三个参数，后者允许步长大于 1，并且可以从大到小来生成。
 **/
public class Repeat {
    // Runnable接口应该由实例旨在由线程执行的任何类实现。 该类必须定义一个没有参数的方法，称为run 。
    // 此接口旨在为希望在活动状态下执行代码的对象提供通用协议。 例如， Runnable由Thread类实现。 处于活动状态仅表示线程已启动但尚未停止。
    // 另外， Runnable还提供了一种使类在不继承Thread处于活动状态的方法。 实现Runnable的类可以通过实例化Thread实例并将其自身作为目标传递而无需继承Thread的子类。 在大多数情况下，如果您仅打算覆盖run()方法而没有其他Thread方法，则应使用Runnable接口。 这很重要，因为除非程序员打算修改或增强类的基本行为，否则不应将类归为子类。
    public static void repeat(int n, Runnable action) {
        range(0, n).forEach(i -> action.run());
    }
}
