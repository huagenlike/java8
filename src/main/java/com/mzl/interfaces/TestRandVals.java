package com.mzl.interfaces;

/**
 * @ClassName： TestRandVals
 * @Description：
 * @author：lhg
 * @data：2020/11/17 15:37
 * @Version：1.0
 * 因为字段是 static 的，所以它们在类第一次被加载时初始化，这发生在任何字段首次被访问时。下面是个简单的测试：
 **/
public class TestRandVals {
    public static void main(String[] args) {
        System.out.println(RandVals.RANDOM_INT);
        System.out.println(RandVals.RANDOM_LONG);
        System.out.println(RandVals.RANDOM_FLOAT);
        System.out.println(RandVals.RANDOM_DOUBLE);
    }
}
