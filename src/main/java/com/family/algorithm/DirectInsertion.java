package com.family.algorithm;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午1:51 2018/7/30
 */
public class DirectInsertion {

    public static void main(String[] args) {
        Integer[] toSortArrays={4,1,9,2,5,67,35,26};
        sort3(toSortArrays);

    }


    //永远跟之前的元素比较
    private static void sort(Integer[] arrays){
        for (int i=0;i<arrays.length;i++){
            //依次校验，该元素与其之前的数据
            for(int j=0;j<i;j++){
                System.out.println("i:"+i+",array[i]:"+arrays[i]+",arrya[j]:"+arrays[j]);
                //当前元素小于之前的元素
                if(arrays[i]<arrays[j]){
                    Integer temp=arrays[i];
                    //所有元素后移一位
                    for(int sort=i-1;sort>=j;sort--){
                        arrays[sort+1]=arrays[sort];
                    }
                    //插入元素
                    arrays[j]=temp;
                }
            }

        }

        for (int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+",");
        }

    }

    //从后往前比较
    public static void sort1(Integer[] arrays){
        int n=arrays.length;
        for (int i=1;i<n;i++){
            int temp=arrays[i];
            int j=0;
            for (j=i-1;j>=0&& temp<arrays[j];j--){
                arrays[j+1]=arrays[j];
            }
            arrays[j+1]=temp;
        }

        for (int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+",");
        }
    }


    //永远跟之后的元素比较
    private static void sort3(Integer[] arrays){
        for (int i=1;i<arrays.length;i++){
            Integer temp=arrays[i];
            //依次校验，该元素与其之前的数据
            int j=i-1;
            for(;j>=0&&arrays[j]>temp;j--){
                //当前元素小于之前的元素
                //所有元素后移一位
                arrays[j+1]=arrays[j];
                //插入元素
            }
            arrays[j+1]=temp;

        }

        for (int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+",");
        }

    }
}
