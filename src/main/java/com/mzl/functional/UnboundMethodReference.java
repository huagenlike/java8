package com.mzl.functional;

/**
 * @ClassName： UnboundMethodReference
 * @Description： 未绑定的方法引用
 * @author：lhg
 * @data：2021/1/27 10:15
 * @Version：1.0
 **/
class X {
    String f() { return "X::f()"; }
}

class Z {
    static String f() { return "X::f()"; }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transform(X x);
}

public class UnboundMethodReference {
    public static void main(String[] args) {
        // 我们尝试把 X 的 f() 方法引用赋值给 MakeString。结果：即使 make() 与 f() 具有相同的签名，编译也会报“invalid method reference”（无效方法引用）错误。
        // 这是因为实际上还有另一个隐藏的参数：我们的老朋友 this。 你不能在没有 X 对象的前提下调用 f()。
        // 因此，X :: f 表示未绑定的方法引用，因为它尚未“绑定”到对象。
         MakeString ms = Z::f;
        // 未绑定的方法引用是指没有关联对象的普通（非静态）方法。 使用未绑定的引用之前，我们必须先提供对象：
        //MakeString sp = X::f; // [1]
        TransformX sp = X::f;
        X x = new X();
        // [2] 的结果有点像脑筋急转弯。
        // 我拿到未绑定的方法引用，并且调用它的transform()方法，将一个X类的对象传递给它，然后就以某种方式导致了对 x.f() 的调用。
        // Java知道它必须拿到第一个参数，该参数实际就是this，并在其上调用方法。
        System.out.println(sp.transform(x)); // [2]
        System.out.println(x.f()); // 同等效果
    }
}
