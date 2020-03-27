package com.family.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/3/27 下午5:26
 * @modified By:
 */
@Component
public class Validate {
    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}
