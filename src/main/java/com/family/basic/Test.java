package com.family.basic;

/*import com.alibaba.fastjson.JSONObject;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.util.SerializationUtils;

import java.util.Arrays;
import java.util.List;*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2019/11/29 下午4:22
 * @modified By:
 */
public class Test {


    public static void main(String[] args) {
        /*User user=new User();
        user.setId(1);
        user.setName("abc");
        byte[] serialize = SerializationUtils.serialize(user);
        Object deserialize = SerializationUtils.deserialize(serialize);
        User user1=(User)deserialize;
        System.out.println(deserialize.toString());


        System.out.println(JSONObject.toJSONString(user));*/
        //test();
        List<User> serviceConfigCitys=new ArrayList<>();
        User u1=new User();
        u1.setType(1000);
        serviceConfigCitys.add(u1);
        User addressDTO =new User();
        addressDTO.setType(1000);
        /*for (User s:serviceConfigCitys){
            if(s.getType()==addressDTO.getType()){
                System.out.println("true");
            }
        }*/
        List<User> existCity = serviceConfigCitys.stream().filter(Objects::nonNull).
                filter(e->addressDTO.getType() ==e.getType()).collect(Collectors.toList());

        System.out.println(existCity);
    }

    public static void test() {
        Test test=new Test();
        synchronized (test){
            System.out.println("aaa");
        }
    }
    public static void test1() {
        ReentrantLock lock=new ReentrantLock();
        try{
            lock.lock();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
