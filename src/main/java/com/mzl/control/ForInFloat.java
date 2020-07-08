package com.mzl.control;

import java.util.Random;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 9:58
 * @version:
 * @modified By:
 */
public class ForInFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float[] f = new float[10];
        for(int i = 0; i < 10; i++)
            f[i] = rand.nextFloat();
        // 定义了一个 float 类型的变量 x，继而将每一个 f 的元素赋值给它。
        for(float x : f)
            System.out.println(x);
    }
}
