package com.mzl.functional;

/**
 * @ClassName： TriFunction
 * @Description：
 * @author：lhg
 * @data：2021/1/28 11:05
 * @Version：1.0
 **/
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
