package com.family.leetcode;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/9/1 上午11:32
 * @modified By:
 */
public class TestMain {



    private static int missNumber(int[] nums) {
        int sum=(nums.length+1)*nums.length/2;
        System.out.println("sum:"+sum);
        int tempSum=0;
        for(int i=0;i<nums.length;i++){
            tempSum=tempSum+nums[i];
        }
        System.out.println("tempSum:"+tempSum);
        return sum-tempSum;
    }

    public static int missNumberV2(int[] nums){
        int num=0;
        for(int i=0;i<nums.length;i++){
            System.out.println("第"+i+"次循环，num="+num);
            num ^= i;
            System.out.println("第"+i+"次循环，num="+num);
            num ^=nums[i];
            System.out.println("第"+i+"次循环，num="+num+",nums[i]="+nums[i]);
        }
        System.out.println("执行完毕：num="+num+"，length:"+nums.length);
        num ^=nums.length;
        System.out.println("异或结果：num:"+num);
        return num;
    }


    /*public static String longestCommonPrefix(String[] strArray){
        String str="";
        String temp="";
        boolean flag=false;
        for(int i=0;i<strArray.length;i++){
            if(!temp.equals("") && temp.equals(strArray[i])){
                str=temp;
                flag=true;
            }
        }
    }*/

    public static int reverse(int x){
        String xchar=x+"";
        if(x<0){
            xchar=xchar.substring(1);
        }
        double temp=0;
        for(int i=0;i<xchar.length();i++){
            System.out.println("char(i):"+xchar.substring(i,i+1));
            System.out.println("math:"+ Math.pow(10,i));
            temp=temp+Double.valueOf(xchar.substring(i,i+1))* Math.pow(10,i);
            System.out.println("temp:"+temp);
        }
        String result=String.format("%.0f",temp);
        if(x<0){
            result="-"+result;
        }
        System.out.println("result:"+result);
        return Integer.valueOf(result);

    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        //int[] nums={0,1,2,3,5};
       /* int[] nums={1,0,3};
        int number=missNumber(nums);
        System.out.println(number);


        System.out.println(missNumberV2(nums));
        int num=5;
        int num2=3;
        System.out.println(num^=num2);
        System.out.println(num^=num2);*/

        System.out.println(Integer.valueOf("012"));
    }
}
