package com.family.config;

import org.apache.ibatis.binding.BindingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/3/27 下午4:21
 * @modified By:
 */
@RestControllerAdvice
public class BadRequestExceptionHandler {

    private Logger logger= LoggerFactory.getLogger(BadRequestExceptionHandler.class);

   @ExceptionHandler(MethodArgumentNotValidException.class)
    public void validation(MethodArgumentNotValidException exception){
        BindingResult bindingResult=exception.getBindingResult();
        if(bindingResult.hasErrors()){
            List<ObjectError> errors=bindingResult.getAllErrors();
            errors.forEach(e->{
                FieldError fieldError=(FieldError)e;
                logger.error("check fail:object:{},filed:{},errorMessage:{}",fieldError.getObjectName(),fieldError.getField(),fieldError.getDefaultMessage());
            });
        }
        return;
    }

    @ExceptionHandler(BindException.class)
    public void validationBind(BindException exception){
        BindingResult bindingResult=exception.getBindingResult();
        if(bindingResult.hasErrors()){
            List<ObjectError> errors=bindingResult.getAllErrors();
            errors.forEach(e->{
                FieldError fieldError=(FieldError)e;
                logger.error("check fail:object:{},filed:{},errorMessage:{}",fieldError.getObjectName(),fieldError.getField(),fieldError.getDefaultMessage());
            });
        }
        return;
    }
    @ExceptionHandler(HttpMessageConversionException.class)
    public void parameterTypeException(HttpMessageConversionException exception){
        logger.error(exception.getCause().getLocalizedMessage());
        logger.error("类型转换错误");
        return;
    }


    @ExceptionHandler({ValidationException.class})
    public  void constraintViolationException(Exception exception){
        if(exception instanceof ConstraintViolationException){
            Set<ConstraintViolation<?>> constraintViolations = ((ConstraintViolationException) exception).getConstraintViolations();
            constraintViolations.forEach(c->{
                System.out.println(c.getMessage());
            });
        }
        return;
    }

  @ExceptionHandler(Exception.class)
  public void handleException(Exception exception, HttpServletRequest request){
      logger.error("request:{} exception:{}",request.getRequestURI(),exception.getLocalizedMessage());
      return;
  }
}
