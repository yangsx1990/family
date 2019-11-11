package com.family.leetcode;

import java.util.List;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午6:05 2019/2/21
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1=new AddTwoNumbers().init();
        ListNode l2=new AddTwoNumbers().initb();
        AddTwoNumbers addTwoNumbers=new AddTwoNumbers();
        //addTwoNumbers.addTwoNumbers(l1,l2);
    }

    private ListNode init() {
        ListNode a1=new ListNode(2);
        ListNode a2=new ListNode(4);
        ListNode a3=new ListNode(3);

        a1.next=a2;
        a2.next=a3;

        return a1;

    }
    private ListNode initb() {

        ListNode b1=new ListNode(5);
        ListNode b2=new ListNode(6);
        ListNode b3=new ListNode(4);


        b1.next=b2;
        b2.next=b3;
        return b1;

    }

   /* public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    }*/

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
  }
}
