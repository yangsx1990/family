package com.family.config;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2019/12/31 上午11:01
 * @modified By:
 */
@Configuration
public class Test {
    @Value("${a}")
    private String a;

    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.put("dialect","mysql");
        properties.put("offsetAsPageNum",true);
        properties.put("rowBoundsWithCount",true);
        properties.put("pageSizeZero",true);
        properties.put("reasonable",true);
        properties.put("supportMethodsArguments",false);
        properties.put("returnPageInfo","none");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

}
