package com.family.leetcode;

/**
 * @description: 原地移除元素
 * @author: yangsaixing
 * @date: Created in 2020/8/28 下午2:49
 * @modified By:
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums={1,3,3,1,2};
        int val=3;
       /* int[] result=test(nums,val);

        for(int i:result){
            System.out.println(i);
        }*/
        System.out.println(new RemoveElement().remove(nums,val));
        System.out.println(3/2);
    }

    public int  remove(int[] nums,int val){
        int pointer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[pointer]=nums[i];
                pointer++;
            }
        }
        return pointer;
    }


    public int removeElementLess(int[] nums,int val){
        int i=0;
        int n=nums.length;
        while (i<n){
            if(nums[i]==val){
                nums[i]=nums[n-1];
                n--;
            }else {
                i++;
            }
        }
        return n;
    }
    private static int[] test(int[] nums, int val) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                if(i==nums.length-1){
                    return nums;
                }else {
                    nums[0]=nums[nums.length-i-1];
                }
            }

        }
        return nums;
    }
}
