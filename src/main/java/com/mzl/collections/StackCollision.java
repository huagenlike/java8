package com.mzl.collections;

/**
 * @ClassName： StackCollision
 * @Description：
 * @author：lhg
 * @data：2020/12/4 15:49
 * @Version：1.0
 * 尽管已经有了 java.util.Stack ，但是 ArrayDeque 可以产生更好的 Stack ，因此更可取。
 * 还可以使用显式导入来控制对“首选” Stack 实现的选择：
 * import com.mzl.collections.Stack;
 **/
public class StackCollision {
    public static void main(String[] args) {
        // 使用自己的 Stack 类
        com.mzl.collections.Stack<String> stack = new com.mzl.collections.Stack<>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
        System.out.println();
        java.util.Stack<String> stack2 =
                new java.util.Stack<>();
        for(String s : "My dog has fleas".split(" "))
            stack2.push(s);
        while(!stack2.empty())
            System.out.print(stack2.pop() + " ");
    }
}
