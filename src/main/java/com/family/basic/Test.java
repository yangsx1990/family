package com.family.basic;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.SerializationUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2019/11/29 下午4:22
 * @modified By:
 */
public class Test {
    public static void main(String[] args) {
        User user=new User();
        user.setId(1);
        user.setName("abc");
        byte[] serialize = SerializationUtils.serialize(user);
        Object deserialize = SerializationUtils.deserialize(serialize);
        User user1=(User)deserialize;
        System.out.println(deserialize.toString());


        System.out.println(JSONObject.toJSONString(user));
    }
}
