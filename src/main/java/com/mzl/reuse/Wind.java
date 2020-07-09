package com.mzl.reuse;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/9 15:27
 * @version:
 * @modified By:
 * 继承最重要的方面不是为新类提供方法。它是新类与基类的一种关系。简而言之，这种关系可以表述为“新类是已有类的一种类型”。
 *
 * 假设有一个基类 Instrument 代表音乐乐器和一个派生类 Wind。
 * 因为继承保证了基类的所有方法在派生类中也是可用的，所以任意发送给该基类的消息也能发送给派生类。
 * 如果 Instrument 有一个 play() 方法，那么 Wind 也有该方法。
 * 这意味着你可以准确地说 Wind 对象也是一种类型的 Instrument。
 */
class Instrument {
    public void play() {
        System.out.println("Instrument~~");
    }

    static void tune(Instrument i) {
        // ...
        i.play();
    }
}

// Wind objects are instruments
// because they have the same interface:
// tune() 方法接受了一个 Instrument 类型的引用。
// 但是，在 Wind 的 main() 方法里，tune() 方法却传入了一个 Wind 引用。
// 鉴于 Java 对类型检查十分严格，一个接收一种类型的方法接受了另一种类型看起来很奇怪，除非你意识到 Wind 对象同时也是一个 Instrument 对象，而且 Instrument 的 tune 方法一定会存在于 Wind 中。
// 在 tune() 中，代码对 Instrument 和 所有 Instrument 的派生类起作用，这种把 Wind 引用转换为 Instrument 引用的行为称作向上转型。
public class Wind extends Instrument {

    public void play() {
        System.out.println("Wind~~");
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // Upcasting
    }
}
