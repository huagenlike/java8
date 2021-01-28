package com.mzl.functional;

/**
 * @ClassName： IntToDoubleFunction
 * @Description：
 * @author：lhg
 * @data：2021/1/28 11:23
 * @Version：1.0
 **/
@FunctionalInterface
public interface IntToDoubleFunction {
    double applyAsDouble(int value);
}
