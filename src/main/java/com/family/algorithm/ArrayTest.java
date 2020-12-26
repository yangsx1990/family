package com.family.algorithm;

import java.util.*;

/**
 * @description: 双指针 降级
 * @author: yangsaixing
 * @date: Created in 2020/12/15 上午9:55
 * @modified By:
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[] nums=new int[]{9};
        //System.out.println("去重后的长度："+getLength(nums));
        //System.out.println("abc".substring(1,3));
        //System.out.println(getIndexStr("mississippi","issipi"));
        //System.out.println("mississippi".substring(7,7+13));
        /*int target=0;
        System.out.println(searchInsert(nums,target));
        System.out.println(searchInsertV1(nums,target));*/
        //System.out.println(countAndSay(3));
        //System.out.println(19 % 10);
        //printArray(plusOne(nums));
        //printArray(plusOneV1(nums));
        //System.out.println(lengthOfLastWord("b   a    "));
       // System.out.println(binaryToTen("1111"));
        /*int[] numss=new int[]{1,2,3,1};
        System.out.println(rob(numss));*/
       /* int[] numss=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(numss));*/
       /*int[] ns=new int[]{1,2,2,2,1};
        System.out.println(majorityElement(ns));*/
        /*int[] ns=new int[]{4,5,6,0,0,0};
        int[] ns1=new int[]{1,2,3};
        //printArray(twoSum(ns,-1));
        merge(ns,3,ns1,3);*/
    }

    /*public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        result.add(list1);
        for (int i = 2; i <=numRows ; i++) {

        }

    }*/

    List<Integer> create(int rows,List<Integer> preList){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        for (int i = 0; i <preList.size()+2 ; i++) {

        }
        return list;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums1.length==0) return;
        if(nums2==null || nums2.length==0) return;
        int i=m-1;
        int j=n-1;
        int pointer=1;
        while(j>=0 && i>=0){
            if(nums1[i]<=nums2[j]){
                nums1[nums1.length-pointer]=nums2[j];
                j--;
            }else{
                nums1[nums1.length-pointer]=nums1[i];
                i--;

            }
            pointer++;
        }
        System.arraycopy(nums2,0,nums1,0,j+1);

        printArray(nums1);

    }

    public static int[] twoSum(int[] numbers, int target) {
        if(numbers==null || numbers.length==0) return new int[]{};
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <numbers.length ; i++) {
            if(!map.containsKey(numbers[i])) {
                map.put(target - numbers[i], i+1);
            }else{
                return new int[]{map.get(numbers[i]),i+1};
            }

        }
        return new int[]{};
    }
    public static int maxSubArray1(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        return 0;
    }

    public static int majorityElement(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int preValue=nums[0];
        int preValueNum=1;
        for (int i = 1; i <nums.length ; i++) {
            if(preValue==nums[i]){
                preValueNum++;
            }else {
                preValueNum--;
                if(preValueNum==0){
                    preValue=nums[i];
                    preValueNum=1;
                }
            }
        }
        return preValue;
    }
    public static int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0]+nums[1],dp[0]);
        dp[1]=Math.max(dp[1],nums[1]);
        System.out.println("1:"+dp[1]);
        for (int i = 2; i <nums.length ; i++) {
            dp[i]=Math.max(dp[i-1]+nums[i],dp[i-1]);
            for (int j = i-1; j >0; j--) {
                dp[i]=Math.max(dp[i],dp[i]-nums[j]);
            }
            System.out.println(dp[i]);
        }

        return dp[nums.length-1];
    }

    /**
     * 相隔数组最大值
     * @param nums
     * @return
     */
    public static int rob(int[] nums) {
        /*int value1=0;
        int value2=0;
        for (int i = 0; i <nums.length ; i++) {
            if(i % 2==0) {
                value2+=nums[i];
            }else {
                value1+=nums[i];
            }
        }
        return value1>value2?value1:value2;*/
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }

    /**
     * 二进制相加
     * 输入: a = "11", b = "1"
     * 输出: "100"
     * 重点考虑：进位 需加一位的问题
     * @param a
     * @param b
     * @return
     */
    public static  String addBinary(String a, String b) {
        int number1=binaryToTen(a);
        int number2=binaryToTen(b);
        return tenToBinary(number1+number2);
    }

    private static String tenToBinary(int number) {
        if(number==0)return "";
        int value=0;
        int result=1;
        String resultStr="";
        while(number==0){
            value=number/2;
            if(value==0)

            for (int i = 1; i <=value ; i++) {
                result=result*2;
            }
            number=number-result;
            result=1;
        }

        return "";
    }

    private static int binaryToTen(String a) {
        int number=0;
        int step=1;
        for (int i = a.length()-1; i >=0 ; i--) {
            if("1".equals(a.substring(i,i+1))){
                if(step==1){
                    number=1;
                }else{
                    number=number+2*step;
                }
                step=step*2;
            }
        }
        return number;
    }

    public static int lengthOfLastWord(String s) {
        int count=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(" ".equals(s.substring(i,i+1))){
                if(count==0) continue;
                return count;
            }else {
                count++;
            }
        }
        return count;
    }
    private static void printArray(int[] plusOne) {
        for (int i = 0; i <plusOne.length ; i++) {
            System.out.println("i="+plusOne[i]);
        }
    }
    public static int[] plusOneV1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    private static int[] plusOne(int[] digits){
        if(digits[0]==0){
            digits[0]=1;
            return digits;
        }
        int last=digits[digits.length-1];
        if(last<9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        }else{
            int value=0;
            for (int i = digits.length-1; i >=0 ; i--) {
                int temp=digits[i]+value;
                if(i== digits.length-1) temp++;
                digits[i]=(temp)% 10;
                value=(temp)/10;
            }
        }
        return digits;
    }

    private static String countAndSay(int n){
            return getString(n-1);
    }
    private static String getString(int n) {
        //if(n=1)
        return getString(n-1);
    }
    private static String getString(String desc) {
        String result="";
        int count=0;
        String temp="";
        for (int i = 0; i <desc.length() ; i++) {
            if(temp==""){
                temp=desc.substring(i,i+1);
                count=1;
            }else if(temp.equals(desc.substring(i,i+1))){
                count++;
            }else{
                result+=(count+temp);
                count=0;
            }
        }
        if(count!=0){
            result+=(count+temp);
        }
        System.out.println("before:"+desc+",after:"+result);
        return result;
    }

    private static int searchInsertV1(int[] nums,int target){
         int length=nums.length;
        int left=0;
        int right=length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
       return left;
    }
    private static int searchInsert(int[] nums,int target){
        /*int temp=nums[0];
        if(nums.length==1 && target>temp) return nums.length;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target && temp<target){
                return i;
            }
            if(i==nums.length-1 && target>nums[i]) return i+1;
            temp=nums[i];
        }
        return 0;*/
       /* for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>=target) return i;

        }
        return nums.length;*/

      return midSearch(nums,0, nums.length-1,target);



    }

    private static int midSearch(int[] nums, int startIndex, int endIndex, int target) {
        if(startIndex>=endIndex){
            return startIndex+1;
        }
        int mid=(endIndex-startIndex)/2+1;
        if(nums[mid]<target){
           return midSearch(nums,mid+1,endIndex,target);
        }else{
           return midSearch(nums,startIndex,mid-1,target);
        }

    }
    /**
     * 实现strStr()
     * @param haystack
     * @param needle
     * @return
     */
    private static int getIndexStr(String haystack,String needle){
        if( needle.length()==0) return 0;
        if(needle.length()>haystack.length()) return -1;
        int j=0;
        String indexStr=needle.substring(j,j+1);
        for (int i = 0; i <haystack.length() ; i++) {
            if(haystack.substring(i,i+1).equals(indexStr)){
                System.out.println("i="+i);
                if(i+needle.length()>haystack.length()){
                    return -1;
                }
                if(needle.equals(haystack.substring(i,i+needle.length()))){
                    return i;
                }
            }

        }

        return -1;
    }
    private static int getLengthV1(int[] nums) {
        if(nums.length==0) return 0;
        int i=0;
        for (int j = 1; j <nums.length ; j++) {
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    /**
     * 移除有序数组中的重复项
     * @param nums
     * @return
     */
    private static int getLength(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int pointer=0;
        int preInt=nums[0];
        for (int i = 1; i <nums.length; i++) {
            if(nums[i]!=preInt){
                nums[pointer+1]=nums[i];
                pointer++;


            }
            preInt=nums[i];
        }

        int[] result=new int[pointer+1];
        int i=0;
        for (int j = 0; j <=pointer ; j++) {
            result[i]=nums[j];
            System.out.println(result[i]);
            i++;
        }

        return pointer+1;
    }


}
