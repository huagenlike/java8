package com.mzl.interfaces.interfaceprocessor;

/**
 * @ClassName： Applicator
 * @Description：
 * @author：lhg
 * @data：2020/11/17 14:52
 * @Version：1.0
 **/
public class Applicator {
    public static void apply(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
