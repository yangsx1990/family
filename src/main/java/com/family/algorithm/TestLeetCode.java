package com.family.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/8/26 上午9:23
 * @modified By:
 */
public class TestLeetCode {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int index=0;
        if(nums.length/2==0){
            index= nums.length/2;
        }else {
            index=nums.length/2-1;
        }
        Map<Integer,Integer> map=new HashMap();
        for(int num:nums){
            if(map.containsKey(num)){
                if(map.get(num)>index){
                    return num;
                }
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1};
        System.out.println(new TestLeetCode().majorityElement(nums));
        System.out.println(nums.length/2);
    }
}
