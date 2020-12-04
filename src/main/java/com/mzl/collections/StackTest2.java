package com.mzl.collections;

/**
 * @ClassName： StackTest2
 * @Description：
 * @author：lhg
 * @data：2020/12/4 15:46
 * @Version：1.0
 **/
public class StackTest2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);
        System.err.println(stack.peek());
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}
