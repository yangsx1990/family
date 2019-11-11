package com.family.algorithm;

import com.family.model.AgencyInfo;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午4:41 2018/12/1
 */
public class StreamAPI {
    public static void main(String[] args) {
        List<AgencyInfo> list=new ArrayList<>();
        for (int i=0;i<80000000;i++){
            AgencyInfo agencyInfo=new AgencyInfo();
            agencyInfo.setId(i);
            agencyInfo.setAgencyName("小白");
            list.add(agencyInfo);
        }
        long startTime=System.currentTimeMillis();
        List<AgencyInfo>list1=setter1(list);
        long endTime=System.currentTimeMillis();
        System.out.println("solution 1: startTime-"+startTime+",endTime-"+endTime+"总时间："+(endTime-startTime));

        long startTime1=System.currentTimeMillis();
        List<AgencyInfo>list2=setter2(list);
        long endTime1=System.currentTimeMillis();
        System.out.println("solution 2:startTime-"+startTime1+",endTime-"+endTime1+"总时间："+(endTime1-startTime1));


    }
    private  static   List<AgencyInfo> setter1(List<AgencyInfo> list){
        return list.stream().filter(agency->agency.getId()<79).collect(toList());
    }

    private  static  List<AgencyInfo> setter2(List<AgencyInfo> list){
        List<AgencyInfo> resultList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()<79){
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }
}
