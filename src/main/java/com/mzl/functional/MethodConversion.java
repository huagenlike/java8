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
    static void test(In1 i1, In2 i2) {
        System.out.println("test");
    }

    static void add(String name, String sex) {
        System.out.println("name：" + name + ",sex：" + sex);
    }
    public static void main(String[] args) {
        BiConsumer<In1,In2> bic;

        bic = MethodConversion::accept;
        // 查看 BiConsumer 的文档，你会看到 accept() 方法。
        // 实际上，如果我们将方法命名为 accept()，它就可以作为方法引用。
        // 但是我们也可用不同的名称，比如 someOtherName()。
        // 只要参数类型、返回类型与 BiConsumer 的 accept() 相同即可。
        bic.accept(new In1(), new In2());

        // 因此，在使用函数接口时，名称无关紧要——只要参数类型和返回类型相同。
        // Java 会将你的方法映射到接口方法。
        // 要调用方法，可以调用接口的函数式方法名（在本例中为 accept()），而不是你的方法名。
        bic = MethodConversion::someOtherName;
        // bic.someOtherName(new In1(), new In2()); // Nope
        bic.accept(new In1(), new In2());

        bic = MethodConversion::test;
        // bic.accept 调用的是 BiConsumer 类 的 accept() 方法。
        bic.accept(new In1(), new In2());

        BiConsumer<String,String> bic1;
        bic1 = MethodConversion::add;
        // bic.accept 调用的是 BiConsumer 类 的 accept() 方法。
        bic1.accept("李华", "男");
    }
}
