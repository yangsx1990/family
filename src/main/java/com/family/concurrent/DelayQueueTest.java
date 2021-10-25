package com.family.concurrent;

import com.family.base.CompareTest;

import java.util.PriorityQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/7/9 下午4:23
 * @modified By:
 */
public class DelayQueueTest {

    public static void main(String[] args) throws InterruptedException {
        /*DelayQueue delayQueue=new DelayQueue();
        delayQueue.put();*/

        /*PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(8);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(6);
        System.out.println(priorityQueue.peek());*/

        Person p1=new Person(23,10,TimeUnit.SECONDS);
        Person p2=new Person(2,30,TimeUnit.SECONDS);
        Person p3=new Person(8,20,TimeUnit.SECONDS);
        DelayQueue<Person> delayQueue=new DelayQueue<Person>();
        delayQueue.put(p1);
        delayQueue.put(p2);
        delayQueue.put(p3);
        for (int i = 0; i <3; i++) {
            Person person=delayQueue.take();
            System.out.println(person);
        }


    }
     static class Person implements Delayed {
        int age;
        long time;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

         public long getTime() {
             return time;
         }

         public void setTime(long time) {
             this.time = time;
         }

         Person(int age,long time,TimeUnit unit) {
            this.age=age;
            this.time=System.currentTimeMillis()+(time>0?unit.toMillis(time):0);
        }

         @Override
         public long getDelay(TimeUnit unit) {
             return time-System.currentTimeMillis();
         }

         @Override
         public int compareTo(Delayed o) {
            Person person=(Person) o;
            return this.time-person.time<=0?-1:1;
         }

         @Override
         public String toString() {
             return "Person{" +
                     "age=" + age +
                     ", time=" + time +
                     '}';
         }
     }

}
