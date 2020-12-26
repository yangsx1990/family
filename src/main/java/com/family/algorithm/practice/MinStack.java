package com.family.algorithm.practice;

import java.util.Arrays;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/12/25 下午3:14
 * @modified By:
 */
public class MinStack {
    int[] nums=null;
    int size=0;
    int minValue=0;
    boolean minValueHas=false;
    public MinStack(){
        nums=new int[10];
    }

    public void push(int x) {
        ensureCapacity();
        if(size==0) {
            minValue=x;
            minValueHas=true;
        }
        minValue=minValue<x?minValue:x;
        nums[size]=x;
        size++;
    }

    private void ensureCapacity() {
        if(size>=nums.length-1){
            nums=Arrays.copyOf(nums,nums.length+(nums.length >>1));
        }
    }

    public void pop() {
        if(size==0) return;
        if(nums[size-1]==minValue){
            int min=nums[0];
            for (int i = 1; i <size-1 ; i++) {
                if(nums[i]<min){
                    min=nums[i];
                }
            }
            minValue=min;
        }
        int[] arrays=new int[nums.length];
        System.arraycopy(nums,0,arrays,0,size-1);
        nums=arrays;
        size--;
        if(size==0) minValueHas=false;
    }

    public int top() {
        if(nums.length==0) return 0;
        return nums[size-1];
    }

    public int getMin() {
        if(size==0) return 0;
        return minValue;
    }

    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();

        System.out.println("nums length:"+minStack.nums.length);
        minStack.push(2147483647);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.push(-2147483648);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());



    /*
        System.out.println(minStack.getMin());  //返回 -3.
        minStack.pop();
        System.out.println(minStack.nums);*/
         // 返回 0.
          // 返回 -2.
    }
}
