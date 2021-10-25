package com.family.concurrent.basic.blocking;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/7/15 下午2:41
 * @modified By:
 */
public class Consumer implements Runnable {
    private BlockingTest test;

    Consumer(BlockingTest test){
        super();
        this.test=test;
    }
    @Override
    public void run() {
        test.printB();
           /*try {
               while (true) {
                   synchronized (this) {
                       Thread.sleep(200);
                       System.out.println("flag2=" + flag);
                       if (!flag) {
                           this.notify();
                           System.out.println("consumer");
                           flag = true;

                           this.wait();
                           System.out.println("consumer wait");
                       }
                       System.out.println("flag 外");
                   }
               }

                *//*if(value==10){
                    value--;
                    System.out.println("[consumer]value="+value);
                    this.notify();
                }else {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }*//*


           } catch (InterruptedException e) {
               e.printStackTrace();
           }*/
    }
}
