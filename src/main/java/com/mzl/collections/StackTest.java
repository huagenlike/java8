package com.mzl.collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName： StackTest
 * @Description： 堆栈Stack
 * @author：lhg
 * @data：2020/12/4 15:43
 * @Version：1.0
 **/
public class StackTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);
        while(!stack.isEmpty())
            // 从此双端队列表示的堆栈中弹出一个元素。 换句话说，删除并返回此双端队列的第一个元素。
            // 此方法等效于removeFirst() 。
            System.out.print(stack.pop() + " ");
    }
}
