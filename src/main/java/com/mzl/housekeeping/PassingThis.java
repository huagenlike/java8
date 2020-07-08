package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 16:27
 * @version:
 * @modified By:
 * this 关键字在向其他方法传递当前对象时也很有用
 */
public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
