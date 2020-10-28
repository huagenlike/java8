package com.mzl.lambda.interfaces;

/**
 * 默认的方法和静态方法不会违反函数接口的约定
 * 默认方法允许我们在接口里添加新的方法，而不会破坏实现这个接口的已有类的兼容性，也就是说不会强迫实现接口的类实现默认方法
 * 默认方法和抽象方法的区别是抽象方法必须要被实现，默认方法不是
 */
@FunctionalInterface
public interface FunctionalDefaultMethods {
    void method();

    default void defaultMethod() {

    }
}
