package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/7 14:55
 * @version:
 * @modified By:
 */
public class Spoon {
    static int i;
    // 与其他静态初始化动作一样，这段代码仅执行一次：当首次创建这个类的对象或首次访问这个类的静态成员（甚至不需要创建该类的对象）时。
    static {
        i = 10;
    }
}
