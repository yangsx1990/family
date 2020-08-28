package com.family.leetcode;

/**
 * @description: 摩尔投票（找出主要元素）
 * @author: yangsaixing
 * @date: Created in 2020/8/28 上午11:01
 * @modified By:
 */
public class MooreVote {

    public static void main(String[] args) {
        int[] nums={1,2};

        System.out.println(test(nums));
    }

    private static  int test(int[] nums) {
        int count=0;
        int temp=nums[0];

        for(int num:nums){
            if(num==temp){
                count++;
            }else {
                count--;
                if(count==0){
                    temp=num;
                    count=1;
                }
            }
        }

        System.out.println("count:"+count+",temp:"+temp);
        int index=0;
        for(int num:nums){
            if(num==temp){
                index++;
            }
            if(index>nums.length/2){
                return num;
            }
        }
        System.out.println("index:"+index);

        return -1;


    }
}
