package com.family.controller;

import com.family.model.AgencyInfo;
import com.family.service.AgencyService;
import com.family.service.JmeterService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
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

//    @Autowired
//    JmeterService jmeterService;


    @RequestMapping("/procedure/test")
    public void procedureTest(Integer id){
        System.out.println("存储过程测试");
        agencyService.procedureMainTest(id);
    }
    @RequestMapping("/data")
    public List<AgencyInfo> query(AgencyInfo agencyInfo){
        System.out.println("调用一次");
        return agencyService.queryAgency(agencyInfo);
    }

    @RequestMapping(value = "/api/data",method = RequestMethod.POST)
    public String get(AgencyInfo agencyInfo){
        return getNewData();
    }

    public String getNewData() {
        String path = "src/main/resources/json/trade_base.json";
        return readData(path);
    }

    private String readData(String path) {
        long startTime = System.nanoTime();
        File file = new File(path);
        String result = null;
        try {
            result = FileUtils.readFileToString(file, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        System.out.println("本次读取耗时"+(endTime - startTime)+"毫秒");
        return result;
    }
}
