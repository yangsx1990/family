package com.family.structure.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * @version V1.0
 * @author: yangsaixing
 * @date: 2021年11月29日 16时16分
 * @contact yangsaixing@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
@RestController
public class RedisController {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;


    @RequestMapping("/redis/test/redis")
    public void insert1(){
        System.out.println("execute save1");
        ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
        operations.set("key_1201", "1234");
    }

    @RequestMapping("/redis/test/string")
    public void insert2(){
        System.out.println("execute save2");
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        operations.set("key_1201_string", "中国");
    }
}
