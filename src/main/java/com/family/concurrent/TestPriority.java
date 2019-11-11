package com.family.concurrent;

import org.codehaus.groovy.runtime.powerassert.SourceText;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author yangsaixing
 * @description 测试线程优先级
 * @date Created in 下午6:55 2019/7/27
 */
public class TestPriority {
    private static volatile boolean notStart=true;
    private static volatile boolean notEnd=true;

    public static void main(String[] args) throws InterruptedException {
        List<Job> jobs=new ArrayList<>();
        for (int i=0;i<10;i++){
            int priority=i<5?Thread.MIN_PRIORITY: Thread.MAX_PRIORITY;
            Job job=new Job(priority);
            jobs.add(job);
            Thread thread=new Thread(job,"Thread:"+i);
            thread.setPriority(priority);
            thread.start();

        }
        notStart=false;
        TimeUnit.SECONDS.sleep(10);
        notEnd=false;

        for(Job job:jobs){
            System.out.println("Job priority:"+job.priority+",Count:"+job.count);
        }
    }


    static class Job implements Runnable{
        private int priority;
        private int count;
        Job(int priority){
            this.priority=priority;
        }

        public void run(){
            while(notStart){
                Thread.yield();//TODO
            }

            while(notEnd){
                Thread.yield();
                count++;
            }
        }
    }

}
