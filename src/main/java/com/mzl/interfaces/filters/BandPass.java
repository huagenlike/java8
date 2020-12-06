package com.mzl.interfaces.filters;

/**
 * @ClassName： BandPass
 * @Description： 带通
 * @author：lhg
 * @data：2020/11/17 14:49
 * @Version：1.0
 **/
public class BandPass extends Filter {
    double lowCutoff, highCutoff;

    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}