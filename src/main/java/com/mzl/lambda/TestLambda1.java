package com.mzl.lambda;

import org.junit.Test;

import java.util.Arrays;

public class TestLambda1 {

    @Test
    public void demo1() {
        // 会根据上下文来推测参数的类型
        Arrays.asList("a", "b", "c", "d").forEach(e -> System.out.println(e));
        // 可以显示地指定参数类型，只需要将类型包在括号里
        Arrays.asList("a", "b", "c", "d").forEach((String e) -> System.out.println(e));
    }

    @Test
    public void demo2() {
        // Lambda表达式可能会引用类的成员或者局部变量（会被隐式地转变成final类型），下面两种写法的效果是一样的
        String separator = ",";
        Arrays.asList("a", "b", "c", "d").forEach(e -> System.out.println(e + separator));

        final String separator1 = ",";
        Arrays.asList("a", "b", "c", "d").forEach(e -> System.out.println(e + separator1));
    }

    @Test
    public void demo3() {
        // Lambda表达式可能会有返回值，编译器会根据上下文推断返回值的类型。如果lambda的语句块只有一行，不需要return关键字
        Arrays.asList("a", "b", "c", "d").sort((e1, e2) -> e1.compareTo(e2));

        Arrays.asList("a", "b", "c", "d").sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            return result;
        });
    }

    @Test
    public void demo4() {

    }
}
