package com.mzl.interfaces;

/**
 * @ClassName： AnInterface
 * @Description：
 * @author：lhg
 * @data：2020/11/17 11:07
 * @Version：1.0
 **/
interface AnInterface {
    void firstMethod();
    void secondMethod();
    // 新增方法，在 AnImplementation 中没有实现它，编译器就会报错：
    // 如果我们使用关键字 default 为 newMethod() 方法提供默认的实现，那么所有与接口有关的代码能正常工作，不受影响，而且这些代码还可以调用新的方法 newMethod()：
    // void newMethod();
}
