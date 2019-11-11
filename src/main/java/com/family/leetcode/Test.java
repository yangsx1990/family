package com.family.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:23 2019/5/10
 */
public class Test {

    transient  String code;
    public static void main(String[] args) {
      /*  ListNode one=new ListNode(2);
        ListNode two=new ListNode(4);
        ListNode three=new ListNode(3);
        one.next=two;
        two.next=three;

        ListNode four=new ListNode(5);
        ListNode five=new ListNode(6);
        ListNode six=new ListNode(4);
        four.next=five;
        five.next=six;
        System.out.println(new Test().addTwoNumbers(one,four));*/


              ListNode one=new ListNode(9);
        ListNode four=new ListNode(9);
        ListNode five=new ListNode(9);
        ListNode six=new ListNode(9);
        ListNode seven=new ListNode(9);
        one.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;
        ListNode two=new ListNode(1);
        System.out.println(new Test().addTwoNumbers(one,two));


    }

    private int getNum(ListNode listNode){
        if(listNode.next!=null){
            return listNode.val;
        }
        return 0;
    }
    private ListNode getNextNode(ListNode listNode){
        if(listNode.next!=null){
            return listNode.next;
        }
        return null;
    }

    public ListNode addTwoNumbers(ListNode l1,ListNode l2){

        int carry=0;
        ListNode l3=l1;
        ListNode l4=l2;
        ListNode result=new ListNode(0);
        ListNode curr=result;
        while(l3!=null ||l4!=null){
            int x=l3==null?0:l3.val;
            int y=l4==null?0:l4.val;
            int sum=carry+x+y;
            carry=sum/10;
            curr.next=new ListNode(sum % 10);
            curr=curr.next;
            if(l3!=null) l3=l3.next;
            if(l4!=null) l4=l4.next;

        }
        if(carry>0){
            curr.next=new ListNode(carry);
        }

        return result.next;

/*

        int sumInt=sum1+sum2;
        String sum=sumInt+"";

        Integer[] list=new Integer[100];
        List<ListNode> listNodes=new ArrayList<>();
        for(int i=sum.length();i>0;i--){
            int num=Integer.valueOf(sum.substring(i-1,i));
            list[i]=num;
           */
/* ListNode result=new ListNode(num);
            listNodes.add(result);*//*


        }

        for(int i=0;i<listNodes.size()-1;i++){
            listNodes.get(i).next=listNodes.get(i+1);
        }



        return listNodes.get(0);*/
    }

    public static class ListNode {
        int val;
        com.family.leetcode.Test.ListNode next;
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
}

