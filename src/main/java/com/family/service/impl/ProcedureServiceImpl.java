package com.family.service.impl;

import com.family.mapper.AgencyInfoMapper;
import com.family.service.ProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2021/11/12 上午11:14
 * @modified By:
 */
@Service
public class ProcedureServiceImpl implements ProcedureService {

    @Autowired
    AgencyInfoMapper agencyInfoMapper;
    @Override
    public void procedureTest(Integer id) {
        agencyInfoMapper.procedure(id);
    }
}
