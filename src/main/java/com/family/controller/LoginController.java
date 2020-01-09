package com.family.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/1/9 下午3:58
 * @modified By:
 */
@Controller
public class LoginController {

        @RequestMapping("/login")
        public String login(){
            return "login";
        }

}
