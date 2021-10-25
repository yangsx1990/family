package com.family.concurrent.basic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/7/6 上午10:24
 * @modified By:
 */
public class WaitNotifyPrint{

    //private AtomicInteger flag=new AtomicInteger(0);
    private volatile Boolean bool=false;
    public static void main(String[] args) {
        WaitNotifyPrint waitNotifyPrint=new WaitNotifyPrint();
            Class1 class1=waitNotifyPrint.new Class1();
            Class2 class2=waitNotifyPrint.new Class2();
            class1.start();
            class2.start();
    }

    /*class Class1 extends Thread{
        @Override
        public void run() {
            while(true){
                synchronized (flag){
                    if(flag.intValue()!=0){
                        try {
                            flag.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            flag.notify();
                        }
                    }

                    System.out.println("22");
                    flag.incrementAndGet();
                    flag.notify();
                }

        }
    }*/

    class Class1 extends Thread {
        @Override
        public  void run() {
            try {
                System.out.println("class1,bool="+bool);
                while (true) {
                    synchronized (this) {
                        this.notifyAll();
                        System.out.println("class1,wait");
                        this.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                this.notify();
            }
            System.out.println("class1,结束wait");
            System.out.println("2");
            this.notify();

        }
    }

    class Class2 extends Thread{
        @Override
        public    void run() {
            try {
                System.out.println("class2,bool="+bool);
                while (true) {
                    synchronized (this) {
                        Thread.sleep(200);
                        this.notifyAll();
                        System.out.println("class2,wait");
                        this.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                this.notify();
            }
            System.out.println("class2,结束wait");
            System.out.println("3");
            this.notify();
        }
    }

   /* class Class2 extends Thread{
        @Override
        public void run() {
            while(true){
               *//* synchronized (flag){
                    if(flag.intValue()!=1){
                        try {
                            flag.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            flag.notify();
                        }
                    }

                    System.out.println("33");
                    flag.incrementAndGet();
                    flag.notify();
                }*//*
                synchronized (bool){
                    try {
                        if(bool) {
                            this.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        this.notify();
                    }
                    System.out.println("2");
                    bool=false;
                    this.notify();
                }
            }
        }
    }*/
}
