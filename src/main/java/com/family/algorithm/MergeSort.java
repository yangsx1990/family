package com.family.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午3:44 2018/11/30
 */
public class MergeSort {


    private void sort(List<Integer> list){

        if(list.size() % 2 ==0){
            //偶数个数
            Integer step =list.size()/2;

            //devide(step,toSortList);
            List<List<Integer>> sortList=new ArrayList<>();
            List<Integer> left=list.subList(0,step);
            List<Integer> right=list.subList(step,2*step);
            if(step==2){
                sortList.add(left);
                sortList.add(right);
                list=new ArrayList<>();
                for (int i=0;i<sortList.size();i++){
                    sortNum(sortList.get(i));
                    list.addAll(sortList.get(i));
                }
                printArray(list);
            }

        }else{
            //奇数个数
        }
    }

    private void printArray(List<Integer> sortList) {
        for(int i=0;i<sortList.size();i++){
            System.out.println(sortList.get(i));
        }
    }

    private void sortNum(List<Integer> list){
        //排序
        Integer num1=list.get(0);
        Integer num2=list.get(1);
        if(num1>num2){
            Integer temp=num1;
            num1=num2;
            num2=temp;
            list.set(0,num1);
            list.set(1,num2);
        }
    }



    public static void main(String[] args) {
       /*List<Integer> toSortList=new ArrayList<>();

        toSortList.add(8);
        toSortList.add(1);
        toSortList.add(3);
        toSortList.add(6);*/
        int[]array={8,3,2,1};

       /* MergeSort mergeSort=new MergeSort();
        mergeSort.mergeSort(array);
        System.out.println(array.toString());*/

    }

    public  void mergeSort(int[]array){

        int length=array.length;
        int middle=length/2;

        if(length>1){
            int[]left= Arrays.copyOfRange(array,0,middle);//拷贝数组array的左半部分
            int[]right=Arrays.copyOfRange(array,middle,length);//拷贝数组array的右半部分
            mergeSort(left);//递归array的左半部分
            mergeSort(right);//递归array的右半部分
            merge(array,left,right);//数组左半部分、右半部分合并到Array
        }
    }

    //合并数组，升序
    private static void merge(int[]result,int[]left,int[]right){

        int i=0,l=0,r=0;

        while(l<left.length&&r<right.length){
            if(left[l]<right[r]){
                result[i]=left[l];
                i++;
                l++;
            }else{
                result[i]=right[r];
                i++;
                r++;
            }
        }

        while(r<right.length){//如果右边剩下合并右边的
            result[i]=right[r];
            r++;
            i++;
        }

        while(l<left.length){
            result[i]=left[l];
            l++;
            i++;
        }
    }
}
