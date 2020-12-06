package com.mzl.interfaces.music5;

import com.mzl.polymorphism.music.Note;

/**
 * @ClassName： Music5
 * @Description： Instrument 作为接口
 * @author：lhg
 * @data：2020/11/17 14:07
 * @Version：1.0
 * play() 和 adjust() 使用 default 关键字定义实现。在 Java 8 之前，这些定义要在每个实现中重复实现，显得多余且令人烦恼：
 **/
interface Instrument {
    // Compile-time constant:
    int VALUE = 5; // static & final

    // automatically public
    default void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    default void adjust() {
        System.out.println("Adjusting " + this);
    }
}

class Wind implements Instrument {
    // 因为 toString() 是根基类 Object 的方法，所以它不需要出现在接口中。
    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument {
    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument {
    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i: e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
