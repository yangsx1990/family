package com.family.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/4/1 上午10:21
 * @modified By:
 */
public class Test {
    public static void main(String[] args) {

        //System.out.println("这是个测试类，用来查看git 提交记录");

        List<Integer> list1=new ArrayList<>();

        list1.add(2);
        //list1.add(2);
        list1.add(1);
        list1.add(1);
        list1.add(3);
       // list1.add(3);


       /* for (int i = 0; i <list1.size() ; i++) {
            if(list1.get(i).equals(1)){
                list1.removeIf(list1.get(i)==1);
            }
        }*/
        System.out.println(list1);
    }
}
