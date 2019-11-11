package com.family.pattern.responsibility;

public class Test {
    public static void main(String[] args) {
        FirstLevel first=new FirstLevel("第一级");
        SecondLevel second=new SecondLevel("第二级");
        first.setHandler(second);
        first.handle(2);
    }
}
