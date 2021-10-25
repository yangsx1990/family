package com.family.concurrent.basic.blocking;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/7/15 下午2:07
 * @modified By:
 */
public class BlockingTest {
    private static int value=0;
    private static boolean flag=true;
    private Object object=new Object();
    static BlockingTest test=new BlockingTest();

    public void printA(){
        synchronized (object){
            while(!flag){
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            flag=false;
            System.out.println("com.family.A");
            object.notifyAll();
        }
    }

    public void printB(){
        synchronized (object){
            while(flag){
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            flag=true;
            System.out.println("B");
            object.notifyAll();
        }
    }


    public static void main(String[] args) {
        /*Producer producer=new Producer(test);
        Consumer consumer=new Consumer(test);

        for (int i = 0; i <20 ; i++) {
            Thread t1=new Thread(producer);
            Thread t2=new Thread(consumer);
            t1.start();
            t2.start();
        }*/
        Test test=new Test();
        for (int i = 0; i <10 ; i++) {
            Thread t1=new Thread(test);
            t1.start();
        }

    }

    static class Test implements Runnable{
        private static int v=0;
        private static Test t=new Test();
        @Override
        public void run() {
            synchronized (t){
                while(v==0){
                    System.out.println(v);
                    try {
                        v=1;
                        t.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(v);
                v=0;
                t.notifyAll();

            }
        }
    }

}
