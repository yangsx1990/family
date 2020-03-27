package com.family.base.work.circularDepency.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/3/27 上午11:34
 * @modified By:
 */
@Component
public class A1Class {
    @Autowired
    A2Class a2Class;
}
