package com.family.algorithm;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:25 2019/1/24
 */
public class ThreeDoor {

    private static Integer count=3;
    private static Integer drawIndex=0;


    /**
     * 初始化门及奖品设定
     */
    private List<Door>   createDoors(){

        List<Door> doors=new ArrayList<>();
        drawIndex=random();

        for (Integer i=0;i<count;i++){
            Boolean status=false;
            Boolean selected=false;

            //假定每次选择第一个
            if (i == 0) {
                selected=true;
            }
            //有奖品的那一个
            if(i==drawIndex){
                status=true;
            }
            doors.add(new Door(i,status,selected,null));

        }
        return doors;
    }

    private Integer random(){
         return new Random().nextInt(count);
    }

    public static void main(String[] args) {
        Integer sum=0;
        for(int j=0;j<10000;j++){
            ThreeDoor door=new ThreeDoor();
            List<Door> doors=  door.createDoors();
            //打开门
            Integer closeIndex=0;
            if(drawIndex==0){
                while(closeIndex==0){
                    closeIndex= door.random();
                }
            }else{
                closeIndex=drawIndex;
            }

            doors.get(closeIndex).setOpen(false);
            Boolean result=doors.get(closeIndex).getStatus();
            if(result==true){
                sum++;
            }

        }
        System.out.println("中奖率："+(float)sum/10000);
        System.out.println((float)2/3);
    }

    @Data
    public class Door{
        private Integer id;
        /**
         * 是否有奖，或门后是否有车。1-有 0-没有
         */
        private Boolean status;

        /**
         * 选手是否抽中，1-有 0-没有
         */
        private Boolean selected;

        /**
         * 主持人是否打开，1-有 0-没有
         */
        private Boolean open;

        public Door(Integer id,Boolean status,Boolean selected,Boolean open){
            this.id=id;
            this.selected=selected;
            this.status=status;
            this.open=open;
        }
    }
}
