package com.mzl.interfaces.interfaceprocessor;

/**
 * @ClassName： Processor
 * @Description：
 * @author：lhg
 * @data：2020/11/17 14:52
 * @Version：1.0
 **/
public interface Processor {
    default String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input);
}