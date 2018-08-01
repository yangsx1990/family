package com.family.algorithm;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午6:59 2018/8/1
 */
public class BubbleSort {

    public static void main(String[] args) {
        Integer[] toSortArrays={97,67,71,12,5,679,35,26};
        new SortUtil().printArrays(toSortArrays);
        sort(toSortArrays);
    }

    private static void sort(Integer[] arrays) {
        int lastIndex=arrays.length-1;
        for (int j=lastIndex;j>=0;j--) {
            for (int i = lastIndex-j; i > 0; i--) {
                //如果后者小于前者，位置互换
                if (arrays[i] < arrays[i - 1]) {
                    Integer temp = arrays[i];
                    arrays[i] = arrays[i - 1];
                    arrays[i - 1] = temp;
                }
                System.out.println("");
                new SortUtil().printArrays(arrays);

            }
            System.out.println("");
            new SortUtil().printArrays(arrays);
        }
    }
}
