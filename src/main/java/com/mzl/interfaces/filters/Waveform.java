package com.mzl.interfaces.filters;

/**
 * @ClassName： Waveform
 * @Description： 波形图
 * @author：lhg
 * @data：2020/11/17 14:48
 * @Version：1.0
 **/
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
