package com.family.base.mapStruct;

/**
 * @version V1.0
 * @author: yangsaixing
 * @date: 2021年11月19日 17时43分
 * @contact yangsaixing@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
public class MapStructTest {
    IConvert iConvert;


    public static void main(String[] args) {
        MapStructTest test=new MapStructTest();
        UserVo userVo=new UserVo();
        userVo.setId(1);
        userVo.setName("zhangsan");
        userVo.setStatus(2);
        PersonVo personVo = test.iConvert.INSTANCE.convert(userVo);
        System.out.println(personVo);
    }
}
