package com.mzl.reuse;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/8 16:35
 * @version:
 * @modified By:
 */
class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    @Override
    public String toString() {
        return s;
    }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}

public class Detergent extends Cleanser {
    // Change a method:
    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }
    // Add methods to the interface:
    public void foam() { append(" foam()"); }
    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        // 显式地调用 Cleanser的 main 方法
        Cleanser.main(args);
    }
}
