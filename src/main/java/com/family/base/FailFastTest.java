package com.family.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/11/30 下午5:40
 * @modified By:
 */
public class FailFastTest {

    private static List<String> list=new ArrayList<>();
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
        /*new ThreadOne().start();
        new ThreadTwo().start();*/
    }

    static class Thread1 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i <6 ; i++) {
                list.add("thread1:"+i);
                printAll();
            }
        }
    }

    static class Thread2 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i <6 ; i++) {
                list.add("thread1:"+i);
                printAll();
            }

        }
    }

    private static void printAll() {
        System.out.println("");

        String value = null;
        Iterator iter = list.iterator();
        while(((Iterator) iter).hasNext()) {
            value = (String)iter.next();
            System.out.print(value+", ");
        }
    }

    /**
     * 向list中依次添加0,1,2,3,4,5，每添加一个数之后，就通过printAll()遍历整个list
     */
    private static class ThreadOne extends Thread {
        public void run() {
            int i = 0;
            while (i<6) {
                list.add(String.valueOf(i));
                printAll();
                i++;
            }
        }
    }

    /**
     * 向list中依次添加10,11,12,13,14,15，每添加一个数之后，就通过printAll()遍历整个list
     */
    private static class ThreadTwo extends Thread {
        public void run() {
            int i = 10;
            while (i<16) {
                list.add(String.valueOf(i));
                printAll();
                i++;
            }
        }
    }
}
