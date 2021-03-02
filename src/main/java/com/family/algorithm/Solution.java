package com.family.algorithm;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/2/3 下午4:37
 * @modified By:
 */
public class Solution {
    public class Status{
        public int lSum,rSum,mSum,iSum;
        
        Status(int lSum,int rSum,int mSum,int iSum){
            this.lSum=lSum;
            this.rSum=rSum;
            this.mSum=mSum;
            this.iSum=iSum;
        }
    }
    
    public int maxSubArray(int[] nums){
        return getInfo(nums,0,nums.length-1).mSum;
    }

    private Status getInfo(int[] nums, int l, int r) {
        if(l==r) return new Status(nums[l],nums[l],nums[l],nums[l]);
        int m=(l+r)>>1;
        Status lSub=getInfo(nums,l,m);
        Status rSub=getInfo(nums,m+1,r);
        return pushSub(lSub,rSub);
    }

    private Status pushSub(Status lSub, Status rSub) {
        int iSum=lSub.iSum+rSub.iSum;
        int lSum=Math.max(lSub.lSum,lSub.iSum+rSub.lSum);
        int rSum=Math.max(rSub.rSum,rSub.iSum+lSub.rSum);
        int mSum=Math.max(Math.max(lSub.mSum,rSub.mSum),lSub.rSum+rSub.lSum);
        return new Status(lSum,rSum,mSum,iSum);
    }
}
