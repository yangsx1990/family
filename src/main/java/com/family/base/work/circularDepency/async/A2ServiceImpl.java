package com.family.base.work.circularDepency.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/3/27 上午11:28
 * @modified By:
 */
@Service
public class A2ServiceImpl implements A2Service {
    @Autowired
    A1Service a1Service;

    @Override
    public void get() {
        System.out.println("a2 get()");
    }
}
