package com.family.algorithm.practice.graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/3/31 下午3:40
 * @modified By:
 */
public class KthLargest {

    private int k;

    List<Integer> list;

    PriorityQueue<Integer> priorityQueue;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        /*list=new ArrayList<>();
        for (int num:nums){
            list.add(num);
        }*/
        priorityQueue=new PriorityQueue<>();
        for (int num:nums){
            add(num);
        }
    }

    public int add(int val) {
       /* list.add(val);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        if(k>list.size()){
            return -1;
        }
        return list.get(k-1);*/
       priorityQueue.offer(val);
       if(priorityQueue.size()>k){
           priorityQueue.poll();
       }
       return priorityQueue.peek();
    }

    public static void main(String[] args) {
        KthLargest kthLargest=new KthLargest(3,new int[]{4,5,8,2});
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));  // return 5
        System.out.println(kthLargest.add(9));   // return 8
        System.out.println(kthLargest.add(4));   // return 8


     /*   List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(7);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list);*/
    }
}
