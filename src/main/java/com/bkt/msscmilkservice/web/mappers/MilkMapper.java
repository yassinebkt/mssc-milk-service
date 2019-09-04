package com.bkt.msscmilkservice.web.mappers;

import com.bkt.msscmilkservice.domain.Milk;
import com.bkt.msscmilkservice.web.model.MilkDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface MilkMapper {

    MilkDto MilkToMilkDto(Milk milk);
    Milk MilkDtoToMilk(MilkDto milkDto);
}
