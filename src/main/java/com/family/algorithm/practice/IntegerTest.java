package com.family.algorithm.practice;

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
        System.out.println(isUgly(22));
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
