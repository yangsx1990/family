package com.family.base;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Random;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/12/7 上午11:15
 * @modified By:
 */
public class BitSetTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            list.add(new Random().nextInt(100));
        }

        BitSet set=new BitSet(1000);
        for (int i = 0; i <100 ; i++) {
            set.set(list.get(i));
        }

        int count=0;
        for (int i = 0; i <1000 ; i++) {
            if(!set.get(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
