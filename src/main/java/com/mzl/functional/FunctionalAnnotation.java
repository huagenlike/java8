package com.mzl.functional;

/**
 * @ClassName： FunctionalAnnotation
 * @Description：
 * @author：lhg
 * @data：2021/1/28 10:47
 * @Version：1.0
 * 可以使用 @FunctionalInterface 注解强制执行此“函数式方法”模式
 **/
@FunctionalInterface
interface Functional {
    String goodbye(String arg);
}

interface FunctionalNoAnn {
    String goodbye(String arg);
}

/*
@FunctionalInterface
interface NotFunctional {
  String goodbye(String arg);
  String hello(String arg);
}
产生错误信息:
NotFunctional is not a functional interface
multiple non-overriding abstract methods
found in interface NotFunctional
*/

public class FunctionalAnnotation {
    public String goodbye(String arg) {
        return "Goodbye, " + arg;
    }
    public static void main(String[] args) {
        FunctionalAnnotation fa = new FunctionalAnnotation();
        // Functional 和 FunctionalNoAnn 定义接口，然而被赋值的只是方法 goodbye()。
        // 首先，这只是一个方法而不是类；其次，它甚至都不是实现了该接口的类中的方法。
        // 这是添加到Java 8中的一点小魔法：如果将方法引用或 Lambda 表达式赋值给函数式接口（类型需要匹配），Java 会适配你的赋值到目标接口。
        // 编译器会自动包装方法引用或 Lambda 表达式到实现目标接口的类的实例中。
        Functional f = fa::goodbye;
        FunctionalNoAnn fna = fa::goodbye;
        // 尽管 FunctionalAnnotation 确实适合 Functional 模型，但 Java不允许我们像fac定义中的那样，将 FunctionalAnnotation 直接赋值给 Functional，因为 FunctionalAnnotation 没有明确说明实现 Functional 接口。
        // 唯一的惊喜是，Java 8 允许我们将函数赋值给接口，这样的语法更加简单漂亮。
        // Functional fac = fa; // Incompatible
        Functional fl = a -> "Goodbye, " + a;
        FunctionalNoAnn fnal = a -> "Goodbye, " + a;
    }
}
