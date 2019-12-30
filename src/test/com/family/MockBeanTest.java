package com.family;


import com.family.mapper.AgencyInfoMapper;
import com.family.model.AgencyInfo;
import com.family.service.AgencyService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: yangsaixing
 * @date: Created in 2019/12/4 上午10:12
 * @modified By:
 */
/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class MockBeanTest {

    @Autowired
    AgencyService agencyService;

    @MockBean
    AgencyInfoMapper agencyInfoMapper;

    @Before
    public void init(){
        List<AgencyInfo> list=new ArrayList<>();
        AgencyInfo agency=new AgencyInfo();
        agency.setId(1);
        agency.setAgencyName("机构");
        list.add(agency);
        Mockito.when(agencyInfoMapper.select(Mockito.anyObject())).thenReturn(list);

       /* Mockito.when(bizMapper.bizList(Mockito.anyInt())).thenAnswer(new Answer<List>() {
            @Override
            public List answer(InvocationOnMock invocation) throws Throwable {
                return list;
            }
        });*/

    }

    @Test
    public void testBizList(){
        AgencyInfo agencyInfo=new AgencyInfo();
        List<AgencyInfo> agencyInfos = agencyService.queryAgency(agencyInfo);
        System.out.println(agencyInfos);
    }
}
