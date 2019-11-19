package com.family.concurrent;

import java.util.ArrayList;
import java.util.List;

public class GCTest {
    public static void main(String[] args) {
        int b=0;
        while(true){
            List<Integer> a=new ArrayList<>();
            b++;
            //a=null;
            if(b>100){
                a=null;
                break;
            }
            a.add(1);
            a=null;
            //a=null;
        }
        //int c=5;
        System.gc();
    }
}
