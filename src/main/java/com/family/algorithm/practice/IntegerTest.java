package com.family.algorithm.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/12/21 上午10:04
 * @modified By:
 */
public class IntegerTest {
    public static void main(String[] args) {
        //System.out.println(isHappy(119));
       /* System.out.println(486 % 10);
        System.out.println(65535 /26);
        System.out.println(convertToTitle(96));*/
        //System.out.println(convertToTitle1(96));
        //System.out.println(getCount(2,1));
        //System.out.println("-2".indexOf(0,2));
       /* System.out.println(0 % 2);
        System.out.println(isPowerOfTwo(16));*/
        //System.out.println(addDigits(10));



        /*System.out.println(3/2);
        System.out.println(guessNumber(2126753390));*/
        //System.out.println(firstBadVersion(2126753390));
        //System.out.println(isUgly(22));
        //System.out.println(massage(new int[]{2,1,4,5,3,1,1,3}));
        //System.out.println(largestPerimeter(new int[]{3,2,1}));

        int[][] result=new int[2][2];
        result[0]=new int[]{1,2,3};
        result[1]=new int[]{4,5,6};
        //result[2]=new int[]{7,8,9};
       // System.out.println(transpose(result).length);
        Integer a=1024;
        //System.out.println(fibV1(45));
        System.out.println(waysToStep(61));

    }


    public static int waysToStep(int n) {
        if(n==1) return 1;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <=n; i++) {
            dp[i]=(dp[i-1]+(dp[i-2]+dp[i-3]) % 1000000007) % 1000000007;
            //dp[i]=dp[i] % 1000000007;
        }
        return dp[n];
    }
   /* public static int[] singleNumbers(int[] nums) {
        int prev=nums[0];
        for (int i = 1; i <nums.length ; i++) {

        }
    }*/

    public static int fib(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
        return fib(n-1)+fib(n-2);
    }

    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap();
        for (int n:nums){
            if(map.containsKey(n)){
                return n;
            }else {
                map.put(n,1);
            }
        }
        return 0;
    }
    public static int fibV1(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
        int[] temp=new int[n+1];
        temp[0]=0;
        temp[1]=1;
        for (int i = 2; i <n+1 ; i++) {
            temp[i]=temp[i-1]+temp[i-2];
            temp[i] %=1000000007;
        }
        return temp[n];
    }

    public  static int[][] transpose(int[][] A) {
        int[][] result=new int[A[0].length][A.length];
        int index=0;
        for (int i = 0; i <A[0].length ; i++) {
            int[] temp=new int[A.length];
            int a=0;
            for (int j = 0; j <A.length ; j++) {
                temp[a]=A[j][i];
                a++;
            }
            result[index]=temp;
            index++;
        }

        return result;
    }
    /*public static int divide(int dividend, int divisor) {
        int left=0;
        int right=dividend;
        while(left<=right){
            long mid=(left+right)/2;
            if()
        }
    }*/

    public static int largestPerimeter(int[] A) {
        if(A==null || A.length<3) return 0;
        int p1=0;
        int p2=1;
        int p3=2;
        int max=0;
        while(p3<A.length){
            if(isTrue(A[p1],A[p2],A[p3])){
                max=Math.max(max,A[p1]+A[p2]+A[p3]);
            }
            if(p3<A.length-1){
                p3++;
            }else if(p2<A.length-2){
                p2++;
                p3=p2+1;
            }else if(p1<A.length-3){
                p1++;
                p2=p1+1;
                p3=p2+1;
            }else {
                return max;
            }
        }
        return max;

    }
    static boolean isTrue(int a,int b,int c){
        if(a+b>c && a+c>b && b+c>a){
            return true;
        }
        return false;
    }
    public static  int massage(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0],nums[1]);
        boolean status=false;
        int sum=0;
        if(dp[0]<nums[1]){
            status=true;
            sum=dp[0];
        }
        for (int i = 2; i <nums.length ; i++) {
            if(status){
                //包含前一个值
                if(dp[i-1]<sum+nums[i]){
                    dp[i]=sum+nums[i];
                    status=true;
                    sum=dp[i-1];
                }else{
                    dp[i]=dp[i-1];
                    sum=sum+nums[i];
                    status=false;
                }
            }else{
                //未包含前一个值
                if(sum<dp[i-1]+nums[i]){
                    dp[i]=dp[i-1]+nums[i];
                    status=true;
                }else {
                    status=false;
                    dp[i]=sum;
                    sum=dp[i-1]+nums[i];
                }

            }

        }
        return dp[nums.length-1];
    }
    public static boolean isUgly(int num) {
        int number=num % 2;
        if(number==0){
            return true;
        }else{
            //return isUgly()
        }
        return false;
    }
    public static int firstBadVersion(int n) {
        long left=0;
        long right=n;
        while(left<=right){
            int mid=(int)((left+right)/2);
            System.out.println(mid);
            if(isBadVersion(mid)){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return (int)left;

    }

    private static boolean isBadVersion(int mid) {
        if(mid>=1702766719){
            return true;
        }else {
            return false;
        }
    }

    public static int guessNumber(int n) {
        long start=1;
        long end=n;
        while(start<=end){
            long mid=(start+end)/2;
            System.out.println(mid);
            int number= guess((int)mid);
            if(number==0) return (int)mid;
            if(number==-1){
                end=mid-1;
            }else if(number==1){
                start=mid+1;
            }
        }
        return 0;
    }

    private static int guess(int n) {
        int pick=1702766719;
        if(pick<n){
            return -1;
        }else
        if(pick>n) {
            return 1;
        }else {
            return 0;
        }
    }

    public static int getSum(int a, int b) {
        while(b!=0){
            int temp= a ^b;

        }
        return a;
    }
    public static int addDigits(int num) {
        if(num<10) return num;
        int a=num/10;
        int b=num %10;
        return addDigits(a+b);
    }

    public static boolean isPowerOfTwo(int n) {
        if(n %2 ==0) {
            if(n==2)return  true;
            return isPowerOfTwo(n / 2);
        }else{
            return  false;
        }

    }
    public static int reverse(int x) {
        String s=x+"";
        int[] nums=new int[s.length()];
        return 0;
    }
    public static int climbStairs(int n) {
        int count=getCount(2,1);
        return 0;
    }

    private static int getCount(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;
        int result=(a+b);
        for (int i = 1; i <=a ; i++) {
            result=result*(a+b-1);
        }
        return result;
    }

    public static String convertToTitle1(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n != 0) {
            n--; // 依次获取 26 进制逻辑上的个位、十位、百位…（虽然在 26 进制中不这么叫）
            //System.out.println('A'+1);
            int s='A' + n % 26;
            System.out.println(s);
            stringBuilder.append((char) (s));
            n /= 26;
        }
        return stringBuilder.reverse().toString();
    }


    public static String convertToTitle(int n) {
        if(n<=26) return getString(n);
        int v1=n /26;
        int v2=n %26;
        if(v2==0){
            v1=v1-1;
            v2=26;
        }
        if(v1>26){
            return convertToTitle(v1)+getString(v2);
        }
        String str1=getString(v1);
        String str2=getString(v2);
        return str1+str2;
    }

    private static String getString(int v1) {
        System.out.println(v1);
        String s="";
        switch (v1){
            case 1:
                s="A";
                break;
            case 2:
                s="B";
                break;
            case 3:
                s="C";
                break;
            case 4:
                s="D";
                break;
            case 5:
                s="E";
                break;
            case 6:
                s="F";
                break;
            case 7:
                s="G";
                break;
            case 8:
                s="H";
                break;
            case 9:
                s="I";
                break;
            case 10:
                s="J";
                break;
            case 11:
                s="K";
                break;
            case 12:
                s="L";
                break;
            case 13:
                s="M";
                break;
            case 14:
                s="N";
                break;
            case 15:
                s="O";
                break;
            case 16:
                s="P";
                break;
            case 17:
                s="Q";
                break;
            case 18:
                s="R";
                break;
            case 19:
                s="S";
                break;
            case 20:
                s="T";
                break;
            case 21:
                s="U";
                break;
            case 22:
                s="V";
                break;
            case 23:
                s="W";
                break;
            case 24:
                s="X";
                break;
            case 25:
                s="Y";
                break;
            case 26:
                s="Z";
                break;
            default:
                break;

        }
        return s;
    }

    public static boolean isHappy(int n) {
        int value=0;
        String nStr=n+"";
        int j=50;
        while(j>0){
            for (int i = 0; i <nStr.length() ; i++) {
                int num=Integer.valueOf(nStr.substring(i,i+1));
                value+=num*num;
                System.out.println("value:"+value);
            }
            if(value==1){
                return true;
            }
            nStr=value+"";
            value=0;
            j--;
        }
        return false;
    }
}
