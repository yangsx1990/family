package com.family;

import com.family.model.AgencyInfo;
import com.family.service.impl.DecoratorAgencyServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2020/6/1 上午11:07
 * @modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class OptionalTest {

    @Autowired
    DecoratorAgencyServiceImpl decoratorAgencyService;

    @Test
    public void returnUser(){
        System.out.println(decoratorAgencyService.getUser(2).orElse(new AgencyInfo()));
        System.out.println(decoratorAgencyService.getUser(2));
    }


    @Test
    public void returnList(){
        List<AgencyInfo> agencyInfos=new ArrayList<>();
        agencyInfos.stream().forEach(k->{
            if(k!=null){
                if(k.getId()==1){
                    k.setAgencyType(2);
                }
            }
        });

        Optional.ofNullable(agencyInfos).orElseGet(()->{
            return new ArrayList<>();
        }).stream().filter(Objects::nonNull).forEach(k->{
            System.out.println(k.getId());
        });
    }
}
