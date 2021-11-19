package com.family.base.mapStruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @version V1.0
 * @author: yangsaixing
 * @date: 2021年11月19日 17时48分
 * @contact yangsaixing@huice.com
 * @company 掌上先机 (http://www.huice.com)
 */
@Mapper
public interface IConvert {

    IConvert INSTANCE= Mappers.getMapper(IConvert.class);

    @Mappings({
            @Mapping(target = "code",source = "id"),
            @Mapping(target = "personName",source = "name"),
            @Mapping(target = "type",source = "status")
    })
     PersonVo convert(UserVo userVo);
}
