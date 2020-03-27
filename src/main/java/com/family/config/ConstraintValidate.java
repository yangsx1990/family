package com.family.config;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.Set;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/3/27 下午5:26
 * @modified By:
 */
@Component
@RestControllerAdvice
public class ConstraintValidate {
    @ExceptionHandler({ValidationException.class})
//    @ResponseBody
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public  void constraintViolationException(Exception exception, WebRequest request){
        System.out.println("进入捕获异常");
        if(exception instanceof ConstraintViolationException){
            exception=(ConstraintViolationException) exception;
            Set<ConstraintViolation<?>> constraintViolations = ((ConstraintViolationException) exception).getConstraintViolations();
            constraintViolations.forEach(c->{
                System.out.println(c.getMessage());
            });
        }
        return;
    }
}
