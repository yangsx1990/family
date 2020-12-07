package com.family.base;

import lombok.Data;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/11/30 上午10:41
 * @modified By:
 */
@Data public class QueueModel {

    private int id;
    private  String name;

    QueueModel(int id,String name){
        this.id=id;
        this.name=name;
    }
}
