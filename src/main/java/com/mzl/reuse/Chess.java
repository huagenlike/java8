package com.mzl.reuse;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/8 17:21
 * @version:
 * @modified By:
 * 如果没有无参数的基类构造函数，或者必须调用具有参数的基类构造函数，则必须使用 super 关键字和适当的参数列表显式地编写对基类构造函数的调用:
 */
class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
