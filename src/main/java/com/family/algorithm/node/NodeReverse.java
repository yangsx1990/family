package com.family.algorithm.node;

import com.family.leetcode.ListNode;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/8/16 下午5:26
 * @modified By:
 */
public class NodeReverse {

    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        Node n6=new Node(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        reverse(n1);
    }

    private static void reverse(Node n1) {
       /* if(n1==null) return;
        Node result=new Node(0);
        Node nextNode=n1.next;
        Node point=n1;
        while(point.next!=null||nextNode !=null){
            nextNode=point.next.next;
            point.next.next=point.next;
            //point.next=null;
            result.next=point.next;
            //result.next.next=po
        }*/
       Node temp=new Node(0);
       Node pointer=n1;
       while(pointer!=null){
           Node next=pointer.next;
           pointer.next=temp.next;
           temp.next=pointer;
           pointer=next;
       }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        int size=0;
        ListNode p=head;
        while(p!=null){
            size++;
            if(left==size){
                ListNode cur=p.next;
            }
            p=p.next;
        }
        return null;
    }
    static class Node{
        int val;
        Node next;
        Node(){};
        Node(int val){ this.val=val;}
    }
}
