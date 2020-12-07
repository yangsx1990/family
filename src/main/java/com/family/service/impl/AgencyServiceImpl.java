package com.family.service.impl;

import com.family.mapper.AgencyInfoMapper;
import com.family.model.AgencyInfo;
import com.family.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午5:38 2018/1/29
 */
@Service
public class AgencyServiceImpl implements AgencyService{
    @Autowired
    AgencyInfoMapper agencyInfoMapper;

    @Override
    public List<AgencyInfo> queryAgency(AgencyInfo agencyInfo) {
        List<AgencyInfo> agencyInfos=new ArrayList<>();
        agencyInfo.setAgencyName("test");
        agencyInfos.add(agencyInfo);

       return agencyInfos;
    }

    @Override
    public void test() {

    }
}
