package com.family.basic;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2019/11/29 下午4:22
 * @modified By:
 */
public class Test {
    public static void main(String[] args) {
        String[] strs={"a","b"};
        List<String> list= Arrays.asList(strs);
        list.add("c");
    }
}
