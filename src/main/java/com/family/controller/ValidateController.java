package com.family.controller;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/3/27 下午3:54
 * @modified By:
 */
@RestController
@Validated
public class ValidateController {


    @RequestMapping("/validate")
    public String test1(@Valid @NotNull(message = "参数不能那个为空") String str,@NotNull Integer id){
        System.out.println();
        return "";
    }

    @RequestMapping("/validate3")
    public String test3(@NotNull(message = "str不能为null") String str,@NotNull(message = "id不能为空") Integer id){
        System.out.println();
        return "";
    }

    @RequestMapping("/validate1")
    public String test2(@Valid Student str){
        System.out.println();
        return "";
    }

    @RequestMapping("/validate2")
    public String test3(@Valid @RequestBody Student str){
        System.out.println();
        return "";
    }

    @Data
    public  static class Student  implements Serializable {
        @NotNull(message = "id不能为空")
        private int id;
        @NotNull(message = "姓名不能为空")
        private String name;

        @NotNull(message ="密码不能为空" )
        private String password;
    }
}
