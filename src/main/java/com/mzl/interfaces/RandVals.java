package com.mzl.interfaces;

import java.util.Random;

/**
 * @ClassName： RandVals
 * @Description： 初始化接口中的字段
 * @author：lhg
 * @data：2020/11/17 15:37
 * @Version：1.0
 * 接口中定义的字段不能是“空 final"，但是可以用非常量表达式初始化。
 **/
public interface RandVals {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong() * 10;
    float RANDOM_FLOAT = RAND.nextLong() * 10;
    double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}
