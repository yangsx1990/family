package com.family.service;

import com.family.model.AgencyInfo;

import java.util.List;

/**
 * @author yangsaixing
 * @description
 * @date Created in 下午5:33 2018/1/29
 */
public interface AgencyService {

    List<AgencyInfo> queryAgency(AgencyInfo agencyInfo);

    void test();

    void procedureMainTest(Integer id);
}
