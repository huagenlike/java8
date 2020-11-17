package com.mzl.interfaces.filters;

/**
 * @ClassName： Filter
 * @Description：
 * @author：lhg
 * @data：2020/11/17 14:48
 * @Version：1.0
 **/
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
