package com.mzl.reuse;

/**
 * @description: 组合
 * @author: lhg
 * @date: Created in 2020/7/8 16:10
 * @version:
 * @modified By:
 */
class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }
    @Override
    public String toString() { return s; }
}

// 在 [1] 中，编译器看到你试图“添加”一个 WaterSource 类型的字符串对象 。因为字符串只能拼接另一个字符串，所以它就先会调用 toString() 将 source 转换成一个字符串。
// 然后，它可以拼接这两个字符串并将结果字符串传递给 System.out.println()。
public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    @Override
    public String toString() {
        return
                "valve1 = " + valve1 + " " +
                        "valve2 = " + valve2 + " " +
                        "valve3 = " + valve3 + " " +
                        "valve4 = " + valve4 + "\n" +
                        "i = " + i + " " + "f = " + f + " " +
                        "source = " + source; // [1]
    }
    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}
