package com.family.mapper;

import com.family.model.AgencyInfo;
import tk.mybatis.mapper.common.Mapper;


public interface AgencyInfoMapper extends Mapper<AgencyInfo> {


    void procedure(Integer id);

    void insertTest();
}