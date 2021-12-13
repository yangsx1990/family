package com.family.base.functionInterface;

import com.alibaba.fastjson.JSONObject;
import com.family.basic.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @author: yangsaixing
 * @date: 2021年11月24日 14时04分
 * @contact yangsaixing@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
public class Test {
    public String get(){
        FunctionService functionService=()->{
            return "abc";
        };
        return "def";
    }

  /*  public static void main(String[] args) {
        Test test=new Test();
        System.out.println(test.get());
    }*/


    public static void main(String[] args) {
        List<User> list=new ArrayList<>();
        User user=new User();
        user.setType(1);
        list.add(user);
        ApiResponse apiResponse = ApiResponse.successAndReturn(list);
        System.out.println(JSONObject.toJSONString(apiResponse));
    }
}
