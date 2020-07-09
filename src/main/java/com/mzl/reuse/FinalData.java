package com.mzl.reuse;

import java.util.Random;

/**
 * @description: final 数据
 * @author: lhg
 * @date: Created in 2020/7/9 17:21
 * @version:
 * @modified By:
 * 一个被 static 和 final 同时修饰的属性只会占用一段不能改变的存储空间。
 *
 * 当用 final 修饰对象引用而非基本类型时，其含义会有一点令人困惑。
 * 对于基本类型，final 使数值恒定不变，而对于对象引用，final 使引用恒定不变。
 * 一旦引用被初始化指向了某个对象，它就不能改为指向其他对象。
 * 但是，对象本身是可以修改的，Java 没有提供将任意对象设为常量的方法。
 */
class Value {
    int i; // package access

    Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }
    // Can be compile-time constants:
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    // Typical public constant:
    public static final int VALUE_THREE = 39;
    // Cannot be compile-time constants:
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    // Arrays:
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //- fd1.valueOne++; // Error: can't change value
        fd1.v2.i++; // Object isn't constant
        fd1.v1 = new Value(9); // OK -- not final
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++; // Object isn't constant
        }
        //- fd1.v2 = new Value(0); // Error: Can't
        //- fd1.VAL_3 = new Value(1); // change reference
        //- fd1.a = new int[3];
        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}
