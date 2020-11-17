package com.mzl.interfaces;

import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @ClassName： AdaptedRandomDoubles
 * @Description：
 * @author：lhg
 * @data：2020/11/17 15:33
 * @Version：1.0
 * 我们可以再次使用适配器模式，但这里适配器类可以实现两个接口。
 * 因此，通过关键字 interface 提供的多继承，我们可以创建一个既是 RandomDoubles，又是 Readable 的类：
 **/
public class AdaptedRandomDoubles implements RandomDoubles, Readable {
    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNextDouble()) {
            System.out.print(s.nextDouble() + " ");
        }
    }
}
