package com.family.pattern.responsibility.functionCallback;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/11/9 下午4:05
 * @modified By:
 */
public class ImplA implements ICallBack {
    @Override
    public void doFilter(IChain chain) {
        System.out.println("before impla");
        chain.doFilter();
        System.out.println("after impla");
    }
}
