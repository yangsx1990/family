package com.family.leetcode;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午6:00 2019/2/21
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums={-1,-2,-3,-4,-5};
        int target=-8;
        getOne(nums,target);


    }

    /**
     * Answer1
     * @param nums
     * @param target
     * @return
     */
    private static int[] getOne(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            int currentNum=0;
            currentNum=target-nums[i];
            result[0]=i;
            System.out.println("先放入"+nums[i]+",剩余数字为："+currentNum);

            for(int num=i+1;num<nums.length;num++){
                if(num!=i){
                    if(currentNum==nums[num]){
                        result[1]=num;
                        return result;
                    }
                }

            }
        }
        return result;
    }
}
