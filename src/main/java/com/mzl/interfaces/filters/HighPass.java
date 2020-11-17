package com.mzl.interfaces.filters;

/**
 * @ClassName： HighPass
 * @Description： 高通
 * @author：lhg
 * @data：2020/11/17 14:49
 * @Version：1.0
 **/
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
