package com.family.basic;

import java.io.*;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午10:39 2019/9/16
 */
public class SerializableTest {

    public static  final String filePath="/Users/yangsaixing/Documents/test/serial/a.txt";

    public static void main(String[] args) {
        //writeData();
        readData();
    }


    public static void writeData(){
        User user=new User();
        user.setName("张三");
        //user.setRemark("comment");
        ObjectOutputStream objectOutputStream=null;
        try {
            objectOutputStream=new ObjectOutputStream(new FileOutputStream(new File(filePath)));
            objectOutputStream.writeObject(user);
            System.out.println("序列化完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readData(){
        User user=null;
        ObjectInputStream objectInputStream=null;
        try {
            objectInputStream=new ObjectInputStream(new FileInputStream(new File(filePath)));
            user=(User)objectInputStream.readObject();
            System.out.println("反序列化成功");
            System.out.println(user.getName());
            //System.out.println(user.getRemark());
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
