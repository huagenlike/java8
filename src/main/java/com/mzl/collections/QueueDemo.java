package com.mzl.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @program: java8
 * @description:
 * @author: may
 * @create: 2020-12-07 20:31
 * 通过将 LinkedList 向上转换为 Queue
 **/
public class QueueDemo {
    public static void printQ(Queue queue) {
        // peek() 和 element() 都返回队头元素而不删除它，但是如果队列为空，则 element() 抛出 NoSuchElementException ，而 peek() 返回 null 。
        while(queue.peek() != null)
            // poll() 和 remove()* 都删除并返回队头元素，但如果队列为空，poll() 返回 null ，而 remove() 抛出 NoSuchElementException 。
            System.out.print(queue.remove() + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for(int i = 0; i < 10; i++)
            // offer() 是与 Queue 相关的方法之一，它在允许的情况下，在队列的尾部插入一个元素，或者返回 false 。
            // 自动包装机制会自动将 nextInt() 的 int 结果转换为 queue 所需的 Integer 对象，并将 char c 转换为 qc 所需的 Character 对象。
            queue.offer(rand.nextInt(i + 10));
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for(char c : "Brontosaurus".toCharArray())
            qc.offer(c);
        printQ(qc);
    }
}
