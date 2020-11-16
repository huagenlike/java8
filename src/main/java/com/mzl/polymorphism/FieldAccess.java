package com.mzl.polymorphism;

/**
 * @ClassName： FieldAccess
 * @Description： 陷阱：属性与静态方法
 * @author：lhg
 * @data：2020/11/16 15:29
 * @Version：1.0
 **/
class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        /**
         * 当 Sub 对象向上转型为 Super 引用时，任何属性访问都被编译器解析，因此不是多态的。
         * 在这个例子中，Super.field 和 Sub.field 被分配了不同的存储空间，因此，Sub 实际上包含了两个称为 field 的属性：它自己的和来自 Super 的。
         * 然而，在引用 Sub 的 field 时，默认的 field 属性并不是 Super 版本的 field 属性。
         * 为了获取 Super 的 field 属性，需要显式地指明 super.field。
         */
        Super sup = new Sub(); // Upcast
        System.out.println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field + ", sub.getField() = " + sub.getField() + ", sub.getSuperField() = " + sub.getSuperField());
    }
}
