package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 16:22
 * @version:
 * @modified By:
 * this 关键字只能在非静态方法内部使用
 * this 关键字只用在一些必须显式使用当前对象引用的特殊场合。
 */
public class Apricot {
    void pick() {
        /* ... */
    }

    void pit() {
        pick();
        /* ... */
    }
}
