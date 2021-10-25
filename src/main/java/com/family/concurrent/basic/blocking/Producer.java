package com.family.concurrent.basic.blocking;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/7/15 下午2:41
 * @modified By:
 */
public class Producer implements Runnable{
    private BlockingTest test;

    Producer(BlockingTest test){
        super();
        this.test=test;
    }
    @Override
    public void run() {
            test.printA();

                /*try {
                    while(true) {
                        synchronized (this) {

                            System.out.println("flag1=" + flag);
                            if (flag) {
                                this.notify();
                                System.out.println("producer");
                                flag = false;
                                this.wait();
                                System.out.println("producer wait");
                            }
                        *//*if(value<10){
                            value++;
                            System.out.println("[produce]value="+value);
                        }else {
                            try {
                                this.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }*//*
                        }
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
    }
}
