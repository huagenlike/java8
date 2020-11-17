package com.mzl.interfaces;

/**
 * @ClassName： MICollision
 * @Description： 多继承
 * @author：lhg
 * @data：2020/11/17 11:45
 * @Version：1.0
 * 若实现多个接口时，借口的默认方法，
 **/
interface Bob1 {
    default void bob() {
        System.out.println("Bob1::bob");
    }
}

interface Bob2 {
    default void bob() {
        System.out.println("Bob2::bob");
    }
}

// 方法有相同的方法名和签名，编译器无法用它来区分方法。——方法签名包括方法名和参数类型
// 解决这个问题，需要覆写冲突的方法
// class Bob implements Bob1, Bob2 {}
/* Produces:
error: class Bob inherits unrelated defaults
for bob() from types Bob1 and Bob2
class Bob implements Bob1, Bob2 {}
^
1 error
*/

interface Sam1 {
    default void sam() {
        System.out.println("Sam1::sam");
    }
}

interface Sam2 {
    default void sam(int i) {
        System.out.println(i * 2);
    }
}

// 方法有相同的方法名但是签名不同，编译器也是用它来区分方法。——方法签名包括方法名和参数类型
class Sam implements Sam1, Sam2 {}

interface Max1 {
    default void max() {
        System.out.println("Max1::max");
    }
}

interface Max2 {
    default int max() {
        return 47;
    }
}
// Max2和Max 1类型不兼容；都定义max（），但返回类型不相关，也没法覆写
// class Max implements Max1, Max2 {}
/* Produces:
error: types Max2 and Max1 are imcompatible;
both define max(), but with unrelated return types
class Max implements Max1, Max2 {}
^
1 error
*/