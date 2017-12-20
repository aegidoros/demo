package com.example.demo.mapper;

import com.example.demo.entities.BottleEntity;
import com.example.demo.model.Bottle;
//import com.example.demo.service.impl.BottleServiceImpl;
import org.mapstruct.Mapper;

//@Mapper(componentModel = "spring", uses= BottleServiceImpl.class)
public interface BottleMapper {

    Bottle bottleEntityToBottle (BottleEntity bottleEntity);

    BottleEntity bottleToBottleEntity (Bottle bottle);
}
