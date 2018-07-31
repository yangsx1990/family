package com.family.controller;

import com.family.model.StudentInfo;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangsaixing
 * @description
 * @date Created in 上午11:12 2018/7/24
 */
@RestController
public class LogController {
    private final Logger logger= LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/log/query")
    public String get(String studentNo){
        logger.info("进入查询日志方法，学号：{}",studentNo);
        logger.warn("进入查询日志方法");
        logger.error("进入查询日志方法");
        return "success";
    }
}
