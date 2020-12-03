package com.mzl.collections;

import java.util.ArrayList;

/**
 * @ClassName： ApplesAndOrangesWithoutGenerics
 * @Description：
 * @author：lhg
 * @data：2020/12/3 16:26
 * @Version：1.0
 * 简单集合的使用（禁止编译器警告）
 **/
class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() { return id; }
}

class Orange {}

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for(int i = 0; i < 3; i++)
            apples.add(new Apple());
        // No problem adding an Orange to apples:
        apples.add(new Orange());
        for(Object apple : apples) {
            // 在调用 Apple 的 id() 方法之前，强制执行转型
            ((Apple) apple).id();
            // Orange is detected only at run time
        }
    }
}
