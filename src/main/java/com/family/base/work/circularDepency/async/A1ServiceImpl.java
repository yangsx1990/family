package com.family.base.work.circularDepency.async;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/3/27 上午11:28
 * @modified By:
 */
@Service
public class A1ServiceImpl implements A1Service {
    @Autowired
    A2Service a2Service;

    @Async
    //@Transactional
    @Override
    public void get() {
        System.out.println("a1 get()");
    }
}
