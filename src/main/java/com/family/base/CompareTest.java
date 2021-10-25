package com.family.base;

import java.util.Arrays;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/7/9 下午6:02
 * @modified By:
 */
public class CompareTest {

    static class Person implements Comparable<Person>{
        int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Person o) {
            return this.age-o.age;
        }

        Person(int age){
            this.age=age;
        }
    }

    public static void main(String[] args) {
        Person p1=new Person(80);
        Person p2=new Person(20);
        Person[] peoples=new Person[]{p1,p2};
        for (Person person : peoples)
        {
            System.out.print(person.getAge());
        }
        Arrays.sort(peoples);
        for (Person person : peoples)
        {
            System.out.print(person.getAge());
        }
    }
}
