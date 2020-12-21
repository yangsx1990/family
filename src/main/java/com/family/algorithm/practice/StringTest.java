package com.family.algorithm.practice;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/12/11 上午9:59
 * @modified By:
 */
public class StringTest {
    public static void main(String[] args) {
        /*int number=121210;
        boolean status=check(number);
        System.out.println(status);
        int number1=romanToInt("IV");
        System.out.println("number1:"+number1);*/
       /* String[] strs=new String[]{"flower","flxar","fla","fla"};
        String prex=getStr2(strs);
        System.out.println(prex);

        String s="{[[]]}";
        System.out.println(checkStr(s));*/
       /*int[] nums=new int[]{1,3,4,1,4};
        System.out.println( singleNumber(nums) );*/

        String str="A man, a plan, a canal: Panama";
        str="Marge, let's \"[went].\" I await {news} telegram.";
        System.out.println(isPalindrome(str));
        /*for (int i=0;i<str.length();i++){
            System.out.println(str.substring(i,i+1));

        }*/
    }

    public static boolean isPalindrome(String s) {

        String firstStr="";
        String secondStr="";
        for (int i = 0; i <s.length() ; i++) {
            if(!isLetterOrNumber(s.substring(i,i+1))){
                s=s.replace(s.substring(i,i+1)," ");
            }
        }
        s=s.replace(" ","");
        int begin=0;
        int end=s.length()-1;
        while(begin!=end && s.length()>0 && end>=0 ){
            firstStr=s.substring(begin,begin+1);
            begin++;
            secondStr=s.substring(end,end+1);
            end--;
            if(firstStr!="" && secondStr!=""){
                System.out.println("first:"+firstStr+",second:"+secondStr);
                if(!isEqual(firstStr,secondStr)){
                    return false;
                }else{
                    firstStr="";
                    secondStr="";
                }
            }
        }


        return true;
    }

    private static  boolean isEqual(String a,String b){
        if(!isLetterOrNumber(a) || !isLetterOrNumber(b)) return false;
        if(a.equals(b)) return true;
        byte byteA=(byte)a.charAt(0);
        byte byteB=(byte)b.charAt(0);
        if(isNumber(byteA) || isNumber(byteB)) return false;
        if(isLetter(byteA) && isLetter(byteB)) {
            if (byteA - byteB == 32) return true;
            if ((byte) a.charAt(0) - (byte) b.charAt(0) == -32) return true;
        }

        return false;
    }
    private static boolean isLetterOrNumber(String s) {
        char ss=s.charAt(0);
        byte b=(byte) ss;
        if(isLetter(b)) return true;
        if(isNumber( b) ) return true;
        return false;
    }
    private static boolean isLetter(byte b) {
        if(b>=65 && b<=90) return true;
        if(b>=97 && b<=122) return true;
        return false;
    }
    private static boolean isNumber(byte b) {
        if(b>=48 && b<=57) return true;
        return false;
    }

    public static int singleNumber(int[] nums){
        int single=0;
        for (int i = 0; i <nums.length ; i++) {
            single ^=nums[i];
        }
        return single;
    }

    private static boolean checkStr(String s){
        if(s==null || s.length()==0){
            return true;
        }
        int i=s.length()/2+1;
        while(i>0){
            s=s.replace("()","").replace("{}","").replace("[]","");
            if(s.length()==0){
                return true;
            }
            i--;
        }

        return false;
    }

    /**
     * 字符串数组的最长公共前缀-分治法
     * @param strs
     * @return
     */
    private static String getStr2(String[] strs){
       /* String[] result=new String[strs.length/2 +1];
        int index=0;
        while(result.length>1){
            result=new String[strs.length/2 +1];
            for (int i = 0; i < strs.length; i++) {
                if(i==strs.length-1){
                    result[index]=strs[i];
                    index++;
                    break;
                }
                String first=getCommonStr(strs[i],strs[i+1]);
                result[index]=first;
                index++;
                i++;
            }
            //getStr2(result);
        }

        //String str=
        return result[0];*/
       if(strs==null || strs.length==0){
           return "";
       }else{
           return longestCommonPrefix(strs,0,strs.length-1);
       }
    }

    private static String longestCommonPrefix(String[] strs, int start, int end) {
        if(start==end){
            return strs[start];
        }else{
            int mid=(end-start)/2+start;
            String left=longestCommonPrefix(strs,start,mid);
            String right=longestCommonPrefix(strs,mid+1,end);
            return getCommonStr(left,right);
        }
    }

    private static String getCommonStr(String str, String str1) {
        int min=Math.min(str.length(),str1.length());
        for (int i = 0; i <min ; i++) {
            if(str.charAt(i)!=str1.charAt(i)){
                return str.substring(0,i);
            }


        }
        return str.substring(0,min);
    }

    /**
     * 字符串数组的最长公共前缀-二分查找
     * @param strs
     * @return
     */
    private static String getStr1(String[] strs){
        int minLength=Integer.MAX_VALUE;
        for (String s:strs){
            minLength=Math.min(s.length(),minLength);
        }
        int low=0;int high=minLength;
        while(low<high){
            int mid=(high-low+1)/2+low;
            if(isCommonPrefix(strs,mid)){
                low=mid;
            }else{
                high=mid-1;
            }
        }
        return strs[0].substring(0,low);
    }

    private static boolean isCommonPrefix(String[] strs, int mid) {
        String str0=strs[0].substring(0,mid);
        for (int i = 0; i <strs.length ; i++) {
            String str=strs[i];
            for (int j = 0; j <mid ; j++) {
                if(str0.charAt(j)!=str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 字符串数组的最长公共前缀-纵向
     * @param strs
     * @return
     */
    private static String getStr(String[] strs) {
        if(strs==null || strs.length==0) {
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String s="";
        String[] firstArrays=strs[0].split("");
        for (int j=0;j<firstArrays.length;j++){
            String str=firstArrays[j];
            for (int i = 1; i <strs.length ; i++) {
                if(strs[i].length()==0){
                    return s;
                }
                if(j>=strs[i].length()){
                    return s;
                }
                if(!str.equals(strs[i].substring(j,j+1))){
                   return s;
                }else if(i==strs.length-1){
                    s+=str;
                }
            }
        }

        return "";
    }

    /**
     * 罗马数字转整数
     * @param s
     * @return
     */
    private static int romanToInt(String s) {
        int value=0;
        for (int i = 0; i <s.length() ; i++) {
            String str=s.substring(i,i+1);
            value+=getValue(str);
        }
        return handle(s,value);
    }

    private static int handle(String s, int value) {
        if(s.contains("IV") || s.contains("IX")){
            value=value-2*getValue("I");
        }
        if(s.contains("XL") || s.contains("XC")){
            value=value-2*getValue("X");
        }
        if(s.contains("CD") || s.contains("CM")){
            value=value-2*getValue("C");
        }
        return value;
    }

    private static int getValue(String str) {
        switch (str){
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
        }
        return 0;
    }

    /**
     * 判断是否是回文数
     * @param x
     * @return
     */
    private static boolean check(int x) {
        String str=x+"";
        for (int i = 0; i <str.length()/2; i++) {
            String first=str.substring(i,i+1);
            String second=str.substring(str.length()-i-1,str.length()-i);
            System.out.println(first);
            System.out.println(second);
            if(!first.equals(second)){
                return false;
            }
        }
        return true;
    }
}
