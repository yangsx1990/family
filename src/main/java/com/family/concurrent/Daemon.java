package com.family.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @author yangsaixing
 * @description Daemon线程中的finally并不一定会执行
 * @date Created in 下午7:32 2019/7/27
 */
public class Daemon {
    public static void main(String[] args) {
        Thread thread=new Thread(new DaemonRunner(),"Daemon Runner");
        //设置daemon属性需在线程启动之前
        thread.setDaemon(true);
        thread.start();
    }

    static class DaemonRunner implements Runnable{

        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("DaemonRunner finally");
            }
        }
    }
}
