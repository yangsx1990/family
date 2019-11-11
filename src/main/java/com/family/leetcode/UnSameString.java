package com.family.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午11:01 2019/7/10
 */
public class UnSameString {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        int count=1;
        int maxCount=1;
        int end=0;
        for(int i=1;i<s.length();i++){
            //是否有重复字符，true-有，false-无
            boolean flag=true;

            for(int j=i-1;j>=end;j--){
                if(s.charAt(i)==s.charAt(j)){
                    end=i;
                    //有重复字符，比较计数器值
                    if(maxCount<count) {
                        maxCount = count;
                    }
                    break;
                }
                if(j==0){
                    flag=false;
                }
            }
            if(!flag){
                count++;
            }
            if(i==s.length()-1 && maxCount<count){
                maxCount=count;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        UnSameString unSameString=new UnSameString();
        System.out.println(unSameString.lengthOfLongestSubstring("pwwkew"));
    }
}
