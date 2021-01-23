package com.family.algorithm.practice;

import java.util.Stack;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/1/14 上午10:11
 * @modified By:
 */
public class StackTest {
    public static void main(String[] args) {

       /* String[] s=new String[]{"1"};
        System.out.println(calPoints(s));*/
        System.out.println(longestValidParentheses(")()())()()("));
    }

    public static  int longestValidParentheses(String s) {
        if(s==null || s.length()==0) return 0;
        Stack stack=new Stack();
        for (int i = 0; i <s.length() ; i++) {
            stack.push(s.charAt(i)+"");
        }
        int max=0;
        int right=0;
        int temp=0;
        while(!stack.isEmpty()){
            String top= stack.pop().toString();
            if(")".equals(top)){
                right++;
            }else if("(".equals(top)){
                if(right>0){
                    right--;
                    temp=temp+2;
                    max=Math.max(max,temp);
                }else{
                    temp=0;
                }
            }
        }
        return max;
    }

    public static int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        Integer sum=0;
        for (String s:ops){
            switch (s){
                case "C":
                    //移除
                    Integer num=stack.pop();
                    sum-=num;
                    break;
                case "D":
                    Integer top = stack.peek();
                    stack.push(top*2);
                    sum+=top*2;
                    break;
                case "+":
                    Integer s1=stack.pop();
                    Integer s2=stack.peek();
                    stack.push(s1);
                    stack.push(s1+s2);
                    sum+=s1+s2;
                    break;
                default:
                    stack.push(Integer.valueOf(s));
                    sum+=Integer.valueOf(s);
                    break;
            }
        }
        return sum;
    }
}
