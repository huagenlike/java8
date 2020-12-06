package com.mzl.interfaces;

/**
 * @ClassName： InterfaceWithDefault
 * @Description：
 * @author：lhg
 * @data：2020/11/17 11:11
 * @Version：1.0
 **/
public interface InterfaceWithDefault {
    void firstMethod();
    void secondMethod();

    // 使用关键字 default 为 newMethod() 方法提供默认的实现，那么所有与接口有关的代码能正常工作，不受影响，而且这些代码还可以调用新的方法 newMethod()：
    default void newMethod() {
        System.out.println("newMethod");
    }
}
