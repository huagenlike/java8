package com.mzl.interfaces;

/**
 * @ClassName： Months
 * @Description： 接口字段
 * @author：lhg
 * @data：2020/11/17 15:35
 * @Version：1.0
 * 因为接口中的字段都自动是 static 和 final 的，所以接口就成为了创建一组常量的方便的工具。
 * 在 Java 5 之前，这是产生与 C 或 C++ 中的 enum (枚举类型) 具有相同效果的唯一方式。所以你可能在 Java 5 之前的代码中看到：
 * 自 Java 5 开始，我们有了更加强大和灵活的关键字 enum，那么在接口中定义常量组就显得没什么意义了。
 **/
public interface Months {
    int
            JANUARY = 1, FEBRUARY = 2, MARCH = 3,
            APRIL = 4, MAY = 5, JUNE = 6, JULY = 7,
            AUGUST = 8, SEPTEMBER = 9, OCTOBER = 10,
            NOVEMBER = 11, DECEMBER = 12;
}
