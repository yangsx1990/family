package com.family.leetcode;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:27 2019/5/10
 */
public class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x){
        val=x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
