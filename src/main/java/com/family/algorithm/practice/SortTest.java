package com.family.algorithm.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/1/11 下午2:21
 * @modified By:
 */
public class SortTest {
    public static void main(String[] args) {
        int[] nums=new int[]{9,1,2,2,1};
        //printArray(smallerNumbersThanCurrent(nums));
        int[] nums2=new int[]{9,1,2,2,1};
        //printArray(intersect(nums,nums2));
        //printArray(intersection(nums,nums2));

        //printArray(frequencySort(nums));
        int a=10000-1;
        int b=10000-9;

       // System.out.println(a %10000);
        //System.out.println(average(nums2));
        double d=740000.0;
        int d1=740000;
       /* System.out.println(d/18);
        System.out.println(d1/18);
        System.out.println((byte)"a".charAt(0));*/
        //System.out.println(isAnagram("abc","cba"));
        int[] nu=new int[]{3,5,1};
        //System.out.println(canMakeArithmeticProgression(nu));
        int[] b1=new int[]{26,21,11,20,50,34,1,18,0};
        int[] b2=new int[]{2,7,4,9,3,1};
        //printArray(relativeSortArray(b1,b2));
        printArray(quickSortV1(b2));
    }

    public static int[] quickSortV1(int[] nums){

       return quickSort(nums,0,nums.length-1);

    }
    public static int[] quickSort(int[] nums,int startIndex,int endIndex){
        if(nums==null || nums.length<2) return nums;
        int p1=startIndex;
        int p2=endIndex;
        int level=nums[startIndex];
        boolean status=false;
        while(p1<p2){
            if(!status){
                if(nums[p2]>=level){
                    p2--;
                }else {
                    status=true;
                }
            }else if(nums[p1]<=level){
                    p1++;
            }else{
                //交换
                change(nums,p1,p2);
                status=false;
                p2--;
            }

        }
        /*if(p1==startIndex){
            return nums;
        }*/
        if(p1==p2 && p1!=startIndex){
            //交换基准和p1/p2的索引对应值
            change(nums,p1,startIndex);
        }
        if(startIndex<p1){
            quickSort(nums,startIndex,p1);
        }
        if(p1+1<endIndex){
            quickSort(nums,p1+1,endIndex);
        }
        return nums;
    }

    private static void change(int[] nums, int p1, int p2) {
        int temp=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max=0;
        for (int n:arr2){
            max=Math.max(max,n);
        }
        int[] temp=new int[max+1];
        int[] result=new int[arr1.length];
        int resultCount=0;
        for (int i = 0; i <arr1.length ; i++) {
            if(arr1[i]>max){
                result[resultCount]=arr1[i];
                resultCount++;
            }else{
                temp[arr1[i]]++;
            }
        }
        result=Arrays.copyOf(result,resultCount);
        Arrays.sort(result);
        int[] result1=new int[arr1.length];
        int result1Count=0;
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j < temp[arr2[i]]; j++) {
                result1[result1Count]=arr2[i];
                result1Count++;

            }
            if(temp[arr2[i]]>0) temp[arr2[i]]=0;
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i]; j++) {
                result1[result1Count]=i;
                result1Count++;

            }
        }
        for (int i = 0; i <result.length ; i++) {
            result1[result1Count]=result[i];
            result1Count++;
            if(result1Count>=arr1.length) break;
        }
        return result1;

    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int value=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            if(value==0) value=arr[i]-arr[i+1];
            if(arr[i]-arr[i+1]!=value){
                return false;
            }
        }
        return true;
    }
    public static boolean isAnagram(String s, String t) {
        if(s==null || t==null || s.length()!=t.length()) return false;
        if(s.length()==0 && t.length()==0) return true;
        int[] a=new int[s.length()];
        int[] b=new int[t.length()];
        for (int i=0;i<s.length();i++){
            a[i]=(byte)s.charAt(i);

            b[i]=(byte)t.charAt(i);

        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i <s.length() ; i++) {
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }

    public  static double average(int[] salary) {
        double min=Integer.MAX_VALUE;
        double max=Integer.MIN_VALUE;
        double sum=0;
        for (int a:salary){
            min=Math.min(min,a);
            max=Math.max(max,a);
            sum+=a;

        }
        sum=sum-min-max;
        return sum/(salary.length-2);

    }
    public static int[] frequencySort(int[] nums) {
        int[] temp=new int[201];
        for (int n:nums){
            temp[n+100]++;
        }
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=10000*temp[nums[i]+100]-nums[i]+100;
            System.out.println(nums[i]);
        }
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=100-nums[i]%10000;
        }
        return nums;
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        if(nums1==null || nums2==null || nums1.length==0 || nums2.length==0) return new int[]{};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a=0;
        int b=0;
        int[] result=new int[Math.max(nums1.length,nums2.length)];
        int count=0;
        while(a<nums1.length && b<nums2.length){
            if(nums1[a]<nums2[b]){
                a++;
            }else if(nums1[a]==nums2[b]){
                if(count>0 && result[count-1]!=nums1[a]){
                    result[count]=nums1[a];
                    count++;
                }
                if(count==0) {
                    result[count]=nums1[a];
                    count++;
                }
                a++;
                b++;
            }else if(nums1[a]>nums2[b]){
                b++;
            }
        }
        return Arrays.copyOf(result,count);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1==null || nums2==null || nums1.length==0 || nums2.length==0) return new int[]{};
        Map<Integer,Integer> map=new HashMap<>();
        for (int n :nums1){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        int[] num=new int[map.size()];
        int index=0;
        for (int n:nums2){
            if(map.containsKey(n)){
                if(map.get(n)>0){
                    map.put(n,map.get(n)==0?0:map.get(n)-1);
                    num[index]=n;
                    index++;
                    if(index>=num.length){
                        break;
                    }
                }

            }
        }
        return Arrays.copyOf(num,index);
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arrays=new int[501];
        for (int i = 0; i <nums.length ; i++) {
            arrays[nums[i]]++;
        }
        for (int i = 1; i <501 ; i++) {
            arrays[i]=arrays[i]+arrays[i-1];
        }
        int[] result=new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            result[i]=nums[i]==0?0:arrays[nums[i]-1];
        }
        return result;
    }
    private static void printArray(int[] countSort) {
        for (int n:countSort){
            System.out.println(n);
        }
    }

    /**
     * 计数排序（适合整数且比较集中）
     * @param nums
     * @return
     */
    public static int[] countSort(int[] nums){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int n:nums){
            max=Math.max(n,max);
            min=Math.min(n,min);
        }
        int[] result=new int[max+1];
        for (int i = 0; i <nums.length ; i++) {
            result[nums[i]]++;
        }
        int[] arrays=new int[nums.length];
        int index=0;
        for (int i = 0; i <result.length ; i++) {
            if(result[i]>0){
                for (int j = result[i]; j >0 ; j--) {
                    arrays[index]=i;
                    index++;
                }
            }
        }
        return arrays;
    }
}
