package com.family.pattern.responsibility;

/**
 * 链上的对象彼此解耦；
 * 由Client决定链上的顺序。
 */
public class Test {
    public static void main(String[] args) {
        FirstLevel first=new FirstLevel("第一级");
        SecondLevel second=new SecondLevel("第二级");
        first.setHandler(second);
        first.handle(2);
    }
}
