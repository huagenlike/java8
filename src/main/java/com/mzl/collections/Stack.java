package com.mzl.collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName： Stack
 * @Description：
 * @author：lhg
 * @data：2020/12/4 15:44
 * @Version：1.0
 **/
public class Stack<T> {
    private Deque<T> storage = new ArrayDeque<>();
    // 如果有可能在不违反容量限制的情况下立即将元素压入此双端队列表示的堆栈（换句话说，此双端队列的头部），则在当前没有可用空间的情况下IllegalStateException 。
    // 此方法等效于addFirst 。
    public void push(T v) { storage.push(v); }
    // 检索但不删除此双端队列代表的队列的头（换句话说，此双端队列的第一个元素），如果此双端队列为空，则返回null 。
    // 此方法等效于peekFirst() 。
    public T peek() { return storage.peek(); }
    // 从此双端队列表示的堆栈中弹出一个元素。 换句话说，删除并返回此双端队列的第一个元素。
    // 此方法等效于removeFirst() 。
    public T pop() { return storage.pop(); }
    // 如果此集合不包含任何元素，则返回true
    public boolean isEmpty() { return storage.isEmpty(); }
    @Override
    public String toString() {
        return storage.toString();
    }
}
