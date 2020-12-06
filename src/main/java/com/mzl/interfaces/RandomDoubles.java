package com.mzl.interfaces;

import java.util.Random;

/**
 * @ClassName： RandomDoubles
 * @Description：
 * @author：lhg
 * @data：2020/11/17 15:31
 * @Version：1.0
 * 假设你有一个类没有实现 Readable 接口，怎样才能让 Scanner 作用于它呢？下面是一个产生随机浮点数的例子
 **/
public interface RandomDoubles {
    Random RAND = new Random(47);

    default double next() {
        return RAND.nextDouble();
    }

    static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles(){};
        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");
        }
    }
}
