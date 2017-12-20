package com.example.demo.mapper;

import com.example.demo.entities.BottleEntity;
import com.example.demo.model.Bottle;
//import com.example.demo.service.impl.BottleServiceImpl;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BottleMapper extends EntityDTOMapper<Bottle, BottleEntity> {

    BottleMapper INSTANCE = Mappers.getMapper(BottleMapper.class);

}
