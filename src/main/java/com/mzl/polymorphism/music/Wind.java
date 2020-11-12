package com.mzl.polymorphism.music;

/**
 * @ClassName： Instrument
 * @Description：
 * @author：lhg
 * @data：2020/11/12 16:53
 * @Version：1.0
 **/
class Instrument {
    public Instrument() {
        System.out.println("Constructor Instrument");
    }

    public void play(Note n) {
        System.out.println("Instrument.play()");
    }
}

public class Wind extends Instrument {
    public Wind() {
        System.out.println("Constructor Wind");
    }

    // Redefine interface method:
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
