package com.family.base;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Random;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/11/25 上午11:05
 * @modified By:
 */
public class TransactionTest {

    public static void main(String[] args) {
        int numberRange=1000;
        int max=10000;
        Random random=new Random();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<numberRange;i++){
            int result=random.nextInt(max);
            list.add(result);
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("random number created");
        BitSet bitSet=new BitSet(max);
        for (int i = 0; i < numberRange; i++) {
            bitSet.set(list.get(i));
        }

        System.out.println("not in random number:"+bitSet.cardinality());
        for (int i = 0; i <max ; i++) {
            if(!bitSet.get(i)){
                System.out.println(i);
            }
        }
    }
}
