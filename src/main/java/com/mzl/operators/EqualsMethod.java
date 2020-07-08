package com.mzl.operators;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/3 16:01
 * @version:
 * @modified By:
 * 那么怎么比较两个对象的内容是否相同呢？你必须使用所有对象（不包括基本类型）中都存在的 equals() 方法
 */
public class EqualsMethod {
    public static void main(String[] args) {
        Integer n1 = 47;
        Integer n2 = 47;
        System.out.println(n1.equals(n2));
    }
}
