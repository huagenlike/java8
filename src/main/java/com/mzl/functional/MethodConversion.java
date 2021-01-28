package com.mzl.functional;

import java.util.function.BiConsumer;

/**
 * @ClassName： MethodConversion
 * @Description：
 * @author：lhg
 * @data：2021/1/28 10:58
 * @Version：1.0
 **/
class In1 {}
class In2 {}

public class MethodConversion {
    static void accept(In1 i1, In2 i2) {
        System.out.println("accept()");
    }
    static void someOtherName(In1 i1, In2 i2) {
        System.out.println("someOtherName()");
    }
    public static void main(String[] args) {
        BiConsumer<In1,In2> bic;

        bic = MethodConversion::accept;
        // 实际上，如果我们将方法命名为 accept()，它就可以作为方法引用。
        bic.accept(new In1(), new In2());

        bic = MethodConversion::someOtherName;
        // bic.someOtherName(new In1(), new In2()); // Nope
        bic.accept(new In1(), new In2());
    }
}
