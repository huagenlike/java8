package com.mzl.control;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 9:49
 * @version:
 * @modified By:
 */
public class ListCharacters {
    public static void main(String[] args) {
        for(char c = 0; c < 128; c++)
            if(Character.isLowerCase(c))
                System.out.println("value: " + (int)c +
                        " character: " + c);
    }
}
