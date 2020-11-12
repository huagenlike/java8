package com.mzl.polymorphism.music;

/**
 * @ClassName： Music
 * @Description： 向上转型回顾
 * @author：lhg
 * @data：2020/11/12 16:54
 * @Version：1.0
 **/
public class Music {
    public Music() {
        System.out.println("Constructor Wind");
    }

    public static void tune(Instrument i) {
        // i 实际上是传过来的 Wind 对象，所以play 方法为 Wind 类里的方法
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        // 从 Wind 向上转型为 Instrument 可能“缩小”接口，但不会比 Instrument 的全部接口更少。
        tune(flute); // Upcasting
    }
}
