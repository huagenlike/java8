package com.mzl.operators;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/3 16:01
 * @version:
 * @modified By:
 * 那么怎么比较两个对象的内容是否相同呢？你必须使用所有对象（不包括基本类型）中都存在的 equals() 方法
 * 因为 Integer 内部维护着一个 IntegerCache 的缓存，默认缓存范围是 [-128, 127]，在这个范围内是直接返回数值。所以 [-128, 127] 之间的值用 == 和 != 比较也能能到正确的结果，但是不推荐用关系运算符比较
 */
public class EqualsMethod {
    public static void main(String[] args) {
        Integer n1 = 47;
        Integer n2 = 47;
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n1.equals(n2));

        Integer m1 = 200;
        Integer m2 = 200;
        // 超过[-128 - 127] ，比较的是引用地址
        System.out.println(m1 == m2);
        System.out.println(m1 != m2);
        // Integer类 覆写了 equals 方法，实际是转成数值后进行比较的
        System.out.println(m1.equals(m2));
        // 转换成数值进行比较，所以是 true
        System.out.println(m1.intValue() == m2.intValue());
    }
}
