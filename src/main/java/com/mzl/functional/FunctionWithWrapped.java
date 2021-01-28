package com.mzl.functional;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

/**
 * @ClassName： FunctionWithWrapped
 * @Description：
 * @author：lhg
 * @data：2021/1/28 11:18
 * @Version：1.0
 * 我们也可以使用包装类型，如 Function，而不是预定义的基本类型。代码示例：
 **/
public class FunctionWithWrapped {
    public static void main(String[] args) {
        // 表示一个接受一个参数并产生结果的函数。
        //这是一个功能接口，其功能方法为apply(Object) 。
        //类型参数：
        //<T> –函数输入的类型
        //<R> –函数结果的类型
        Function<Integer, Double> fid = i -> (double)i;
        // 表示一个接受整数值参数并产生双值结果的函数。 这是int至- double对原始的专业
        IntToDoubleFunction fid2 = i -> i;
    }
}
