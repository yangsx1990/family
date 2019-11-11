package com.family.concurrent;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午6:43 2019/7/27
 */
public class MultiThread {

    /**
     * 打印java多线程
     * 输出结果：
     * [4]Signal Dispatcher //分发处理发送给JVM信号的线程
     [3]Finalizer //调用对象finalize方法的线程
     [2]Reference Handler //清除Reference线程
     [1]main //main线程，程序入口
     * @param args
     */
    public static void main(String[] args) {
        //获取java线程管理MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        //获取线程和线程堆栈信息（不获取同步的monitor和synchronizer信息）
        ThreadInfo[] threadInfos=threadMXBean.dumpAllThreads(false,false);
        //遍历线程并打印
        for(ThreadInfo threadInfo:threadInfos){
            System.out.println("["+threadInfo.getThreadId()+"]"+threadInfo.getThreadName());
        }


    }


}
