package com.family.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:53 2019/5/7
 */
public class BubbleSort1 {

    public static void main(String[] args) {
        List<Integer> arrays=new ArrayList<>();
        arrays.add(1);
        arrays.add(12);
        arrays.add(4);
        arrays.add(8);
        arrays.add(51);
        simpleSort(arrays);
    }

    private static void simpleSort(List<Integer> arrays) {
        for (int i=0;i<arrays.size();i++){
            for (int j=0;j<arrays.size()-i-1;j++){
                if(arrays.get(j)>arrays.get(j+1)){
                    Integer temp=arrays.get(j);
                    arrays.set(j,arrays.get(j+1));
                    arrays.set((j+1),temp);
                }
            }
        }
        System.out.println(arrays.toString());
    }

    /**
     * 定义内层循环是否交换，若交换，继续外层循环；若未交换，则排序完成。
     * @param arrays
     */
    private static void FlagSort(List<Integer> arrays) {
        Boolean flag=true;
        for (int i=0;i<arrays.size() && flag;i++){
            flag=false;
            for (int j=0;j<arrays.size()-i-1;j++){
                if(arrays.get(j)>arrays.get(j+1)){
                    Integer temp=arrays.get(j);
                    arrays.set(j,arrays.get(j+1));
                    arrays.set((j+1),temp);
                    flag=true;
                }
            }
        }
        System.out.println(arrays.toString());
    }

    /**
     * 记录每一轮中最后一次交换的位置，为零时停止（考虑正序数列）
     * @param arrays
     */
    private static void PositionSort(List<Integer> arrays) {
        Integer position=arrays.size()-1;
        for (int i=0;i<arrays.size();i++){
            for (int j=0;j<arrays.size()-i-1;j++){
                if(arrays.get(j)>arrays.get(j+1)){
                    position=j;
                    Integer temp=arrays.get(j);
                    arrays.set(j,arrays.get(j+1));
                    arrays.set((j+1),temp);
                }
            }
        }
        System.out.println(arrays.toString());
    }
}
