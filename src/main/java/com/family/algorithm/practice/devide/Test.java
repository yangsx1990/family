package com.family.algorithm.practice.devide;

/**
 * @description: 分治法-计算超过半数的元素
 * @author: yangsaixing
 * @date: Created in 2021/4/13 下午3:03
 * @modified By:
 */
public class Test {

    private int countInRange(int[] nums,int num,int low,int high){
        int count=0;
        for (int i = low; i <=high ; i++) {
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }
    
    public int majorityElement(int[] nums){
        return majorityElementRec(nums,0,nums.length-1);
    }

    private int majorityElementRec(int[] nums, int low, int high) {
        System.out.println("low:"+low+",high:"+high);
        //退出条件
        if(low==high) return nums[low];

        //二分法查找
        int mid=(high-low)/2+low;
        int left=majorityElementRec(nums,low,mid);
        int right=majorityElementRec(nums,mid+1,high);

        if(left==right){
            return left;
        }

        System.out.println("left:"+left+",right:"+right);
        int leftCount=countInRange(nums,left,low,high);
        int rightCount=countInRange(nums,right,low,high);

        System.out.println("leftCount:"+leftCount+",rightCount:"+rightCount);
        return leftCount>rightCount?left:right;
    }

    public static void main(String[] args) {
        int[] words=new int[]{2,2,1,1,1,2,2};
        System.out.println(new Test().majorityElement(words));
    }
}
