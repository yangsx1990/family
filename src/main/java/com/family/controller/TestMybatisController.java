package com.family.controller;

import com.family.model.AgencyInfo;
import com.family.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午5:32 2018/1/29
 */
@RestController
public class TestMybatisController {
    @Autowired
    AgencyService agencyService;

    @RequestMapping("/data")
    public List<AgencyInfo> query(AgencyInfo agencyInfo){
        return agencyService.queryAgency(agencyInfo);
    }
}
