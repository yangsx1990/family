package com.family.util.sentive;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/7/6 下午4:45
 * @modified By:
 */
public class ConsumerUtil {

    public static void main(String[] args) {
       List<Integer> ids=new ArrayList<>();
       ids.add(1);
       ids.add(2);
       Integer result=0;
       calc(ids,e->{
           System.out.println( e=e*e);
       });
        System.out.println("ids:"+ids);

        Consumer<Integer> consumer=k-> System.out.println("k="+k);
        consumer.accept(1);

        Predicate<Integer> predicate=k->k>2;
        System.out.println(predicate.test(3));
    }

    private  static void calc(List<Integer> ids, Consumer<Integer> consumer){
        ids.forEach(e->{
            int status=1;
            consumer.accept(e);
        });
    }
}
