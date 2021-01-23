package com.family.algorithm.practice;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/1/14 上午10:43
 * @modified By:
 */
public class MyQueue {

    private int size;
    private Deque<Integer> stack;
    private Deque<Integer> tempStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack=new LinkedList<>();
        tempStack=new LinkedList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        initPush();
        stack.push(x);
        copy();
    }



    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        Integer pop = tempStack.pop();
        return pop;
    }

    /** Get the front element. */
    public int peek() {
        Integer peek = tempStack.peek();
        return peek;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return tempStack.isEmpty();
    }
    private void copy(){
        tempStack.clear();
        while(!stack.isEmpty()){
            Integer num=stack.pop();
            tempStack.push(num);
        }

    }
    private void initPush() {
        stack.clear();
        while(!tempStack.isEmpty()){
            Integer num=tempStack.pop();
            stack.push(num);
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // 返回 1
        System.out.println(queue.pop());   // 返回 1
        System.out.println(queue.empty()); // 返回 false

    }
}
