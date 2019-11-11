package com.family.algorithm;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午3:30 2018/12/3
 */
public class ThreeDoorTest {

    private static  Integer total=3;
    public static void main(String[] args) {
        ThreeDoorTest threeDoorTest =new ThreeDoorTest();
        Integer count=0;
        for(int i=0;i<total;i++){
            List<Door> doorList=new ArrayList<>();
            //设定一个门后有车
            Integer prizeIndex= threeDoorTest.create(doorList);
            //选中一个门
            Integer selectedIndex=new Random().nextInt(total);
            //另外一个还没开的门
            Integer leftIndex= threeDoorTest.judge(doorList,selectedIndex,prizeIndex);
            /*System.out.println("第"+i+"次执行");
            System.out.println("小明选择的是："+selectedIndex);
            System.out.println("————》奖品在："+prizeIndex);
            System.out.println("剩下可供更换的是："+leftIndex);*/
            if(doorList.get(leftIndex).getStatus()){
                count++;
            }
           System.out.println("每次都换，中奖结果是："+doorList.get(leftIndex).getStatus());

        }
        DecimalFormat df=new DecimalFormat("0.0000");

        System.out.println(df.format((float)count/total));

    }

    private  Integer judge(List<Door> doorList,Integer selectedIndex,Integer prizeIndex){
        Integer leftIndex=0;

        for (int i=0;i<doorList.size();i++){
            if(prizeIndex!=selectedIndex){
                leftIndex=prizeIndex;
                break;
            }
            Integer random=new Random().nextInt(total);
            Door door=doorList.get(random);
            if(!door.getId().equals(selectedIndex) && door.getStatus()!=true){
                leftIndex=door.getId();
                break;
            }
        }



        /*for (Door door:doorList){
            if(!door.getId().equals(selectedIndex) && !door.getId().equals(openIndex)){
                leftIndex=door.getId();
            }
        }*/
        return leftIndex;

    }

    private  Integer create(List<Door> doorList){
        Integer random= new Random().nextInt(total);
        for(int i=0;i<total;i++){
            Door door=new Door();
            door.setId(i);
            if(random==i){
                door.setStatus(true);
            }else{
                door.setStatus(false);
            }
            door.setSelected(false);

            doorList.add(door);
        }
        return random;
    }

    class Door{
        private Integer id;
        private Boolean status;
        private Boolean selected;
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Boolean getStatus() {
            return status;
        }

        public void setStatus(Boolean status) {
            this.status = status;
        }

        public Boolean getSelected() {
            return selected;
        }

        public void setSelected(Boolean selected) {
            this.selected = selected;
        }
    }
}
