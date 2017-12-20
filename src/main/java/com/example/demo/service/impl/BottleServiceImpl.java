//package com.example.demo.service.impl;
//
//import com.example.demo.entities.BottleEntity;
//import com.example.demo.mapper.BottleMapper;
//import com.example.demo.model.Bottle;
//import com.example.demo.respositories.BottleRepository;
//import com.example.demo.service.BottleService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Component
//public class BottleServiceImpl implements BottleService {
//
//    private final BottleRepository bottleRepository;
//
//    @Autowired
//    private BottleMapper bottleMapper;
//
//    @Autowired
//    BottleServiceImpl(BottleRepository bottleRepository, BottleMapper bottleMapper) {
//        this.bottleRepository = bottleRepository;
//        //this.bottleMapper = bottleMapper;
//    }
//
//    @Override
//    public List<Bottle> getBottles() {
//        ArrayList<BottleEntity> bottleEntities = (ArrayList<BottleEntity>) bottleRepository.findAll();
//        return bottleEntities.stream().map(bottleEntity -> bottleMapper.bottleEntityToBottle(bottleEntity))
//                .collect(Collectors.toList());
//
//    }
//
//    @Override
//    public Bottle getOneBottle(Long id) {
//        return bottleMapper.bottleEntityToBottle(bottleRepository.findOne(id));
//    }
//}
