package com.mzl.interfaces.filters;

/**
 * @ClassName： LowPass
 * @Description： 低通
 * @author：lhg
 * @data：2020/11/17 14:49
 * @Version：1.0
 **/
public class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input; // Dummy processing 哑处理
    }
}
