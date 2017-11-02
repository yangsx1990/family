package com.family.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午3:58 2017/11/2
 */
@RestController
public class IndexController {
    @RequestMapping("/test")
    public void test(){
        System.out.println("222");
    }
}
