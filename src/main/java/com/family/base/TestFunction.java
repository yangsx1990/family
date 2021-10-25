package com.family.base;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/10/20 下午4:07
 * @modified By:
 */
@FunctionalInterface
interface TestFunction<T> {
    abstract  void print(T t);
}
