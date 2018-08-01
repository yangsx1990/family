package com.family.algorithm;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午7:01 2018/7/31
 */
public class ShellSort {
    public static void main(String[] args) {
        Integer[] toSortArrays={4,1,91,2,5,67,35,26};
        new SortUtil(). printArrays(toSortArrays);
        sort(toSortArrays);
    }


    private static void sort(Integer[] arrays){
        Integer step=0;

        //数组长度是偶数
        if(arrays.length % 2 ==0){
            step=arrays.length/2;
            while(step>=1) {
                System.out.println("step的值是"+step);
                int arrayLast=step;
                for (int i = 0; i < step && arrayLast < arrays.length; i++) {
                    //交换元素
                    if (arrays[i] > arrays[arrayLast]) {
                        int tempData = arrays[i];
                        arrays[i] = arrays[arrayLast];
                        arrays[arrayLast] = tempData;
                    }

                    arrayLast++;
                }
                new SortUtil(). printArrays(arrays);
                step=step/2;
            }
        }


    }

    private  static  void sort1(Integer[] arrays){
        Integer step=0;
        step=arrays.length/2;
        for (int i=0;i<arrays.length;){
            Integer[] sortArray=new Integer[4];
            sortArray[0]=arrays[i];
            //sortArray[]
            new DirectInsertion().sort1(sortArray);
        }
    }

}
