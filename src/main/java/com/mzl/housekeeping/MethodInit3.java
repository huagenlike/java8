package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/7 14:20
 * @version:
 * @modified By:
 */
public class MethodInit3 {
    // int j = g(i); // i还没有初始化，取消注释会报错
    int i = f();

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}