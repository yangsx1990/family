package com.family.base;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/11/30 上午10:13
 * @modified By:
 */
public class ComparableModel implements Comparable {

    private int id;
    private  int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    ComparableModel(){
        super();
    }
    public ComparableModel(int id,int age){
        this.id=id;
        this.age=age;
    }

    @Override
    public String toString() {
        return "ComparableModel{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof ComparableModel){
            ComparableModel m=(ComparableModel) o;
            if(this.id>m.id){
                return 1;
            }else if(this.age== m.age){
                return 0;
            }else {
                return -1;
            }
        }
        return 0;
    }
}
