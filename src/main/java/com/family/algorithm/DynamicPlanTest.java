package com.family.algorithm;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/12/8 上午10:30
 * @modified By:
 */
public class DynamicPlanTest {
    public static void main(String[] args) {

        System.out.println(fibonacci(2));
        System.out.println(fib2(2));
    }

    public static int fibonacci(int n){
        if(n<0){
            return n;
        }
        int[] Memo=new int[n+1];
        /*for (int i = 0; i <=n ; i++) {
            Memo[i]=-1;
        }*/
        return fib(n,Memo);
    }

    private static int fib(int n, int[] memo) {
        if(n<2){
            memo[n]=1;
        }else{
            memo[n]=fib(n-1,memo)+fib(n-2,memo);
        }
        return memo[n];
    }

    public static int fib2(int n){
        if(n<1){
            return n;
        }
        int m2=0;
        int m1=1;
        int m=1;
        for (int i = 2; i <=n ; i++) {
            m=m2+m1;
            m2=m1;
            m1=m;

        }
        return m;
    }
}
