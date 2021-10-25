package com.family.basic;

import java.io.Serializable;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:39 2019/9/16
 */
public class User implements Serializable{


    private static final long serialVersionUID = 4982616605400200185L;

    private String name;

   //private String remark;

   private transient Integer id;


   private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  /*  public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }*/

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", type=" + type +
                '}';
    }
}
