package com.mzl.interfaces;

/**
 * @ClassName： Basic3
 * @Description：
 * @author：lhg
 * @data：2020/11/17 10:23
 * @Version：1.0
 * 可以将一个不包含任何抽象方法的类指明为 abstract，在类中的抽象方法没啥意义但想阻止创建类的对象时，这么做就很有用。
 **/
abstract class Basic3 {
    int f() {
        return 111;
    }

    // No abstract methods
}

public class AbstractWithoutAbstracts {
    // Basic b3 = new Basic3();
    // error: Basic 3 is abstract; cannot be instantiated
}
