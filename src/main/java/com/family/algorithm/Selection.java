package com.family.algorithm;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午1:51 2018/7/30
 */
public class Selection {

    public static void main(String[] args) {
        Integer[] toSortArrays={97,67,71,12,5,679,35,26};
        printArrays(toSortArrays);
        sort(toSortArrays);

    }


    //永远跟之前的元素比较
    private static void sort(Integer[] arrays){
        Integer minIndex=0;
        for (int i=0;i<arrays.length-1;i++){
            minIndex=i;
            System.out.println("第"+(i+1)+"次找最小值");
            for(int j=i+1;j<arrays.length;j++){
                if(arrays[j]<arrays[minIndex]){
                    minIndex=j;
                }
            }
            System.out.println("此时最小值为"+arrays[minIndex]);
            System.out.println("交换值："+arrays[minIndex]+"和"+arrays[i]);
            //交换
            Integer temp=arrays[minIndex];
            arrays[minIndex]=arrays[i];
            arrays[i]=temp;
            printArrays(arrays);

        }

        printArrays(arrays);

    }



    private static void printArrays(Integer[] arrays){

        for (int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+",");
        }

    }
}
