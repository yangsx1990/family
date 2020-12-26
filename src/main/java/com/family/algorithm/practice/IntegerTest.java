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
        System.out.println("-2".indexOf(0,2));
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
