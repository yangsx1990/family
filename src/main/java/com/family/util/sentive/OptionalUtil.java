package com.family.util.sentive;

import com.family.basic.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/5/25 上午11:18
 * @modified By:
 */
public class OptionalUtil {
    public static void main(String[] args) {
        //1.判空
        List<String> strList=new ArrayList<>();
        //Optional<String>  optionalStr=Optional.of(null);
        Optional<String>  optionalStr=Optional.ofNullable("");
        System.out.println(optionalStr.isPresent());

        User user=new User();
        user.setId(1);
        user.setName("张三");
        Optional<User> optionalUser=Optional.ofNullable(user);
        System.out.println(optionalUser.map(User::getName));
        System.out.println(optionalUser.map(e->e.getName()));


        System.out.println(optionalUser.map((e)->Optional.of(e.getName())));

        Optional<User> optionalUserNull=Optional.ofNullable(null);
        //System.out.println(optionalUserNull.map(User::getName));
        System.out.println(optionalUser.flatMap((e)->Optional.of(e.getName())));



        //默认返回值/抛异常
        System.out.println(optionalUserNull.map(User::getName).orElse("Unkown"));
    }
}
