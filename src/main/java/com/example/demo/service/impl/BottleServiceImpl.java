package com.example.demo.service.impl;

import com.example.demo.entities.BottleEntity;
import com.example.demo.mapper.BottleMapper;
import com.example.demo.model.Bottle;
import com.example.demo.respositories.BottleRepository;
import com.example.demo.service.BottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("bottleService")
public class BottleServiceImpl implements BottleService {

    private final BottleRepository bottleRepository;
    private final BottleMapper bottleMapper = BottleMapper.INSTANCE;

    @Autowired
    public BottleServiceImpl(BottleRepository bottleRepository) {
        this.bottleRepository = bottleRepository;
    }

    @Override
    public List<Bottle> getBottles() {

        ArrayList<BottleEntity> bottleEntities = (ArrayList<BottleEntity>) bottleRepository.findAll();
        return bottleEntities.stream().map(bottleEntity -> bottleMapper.toDto(bottleEntity))
                .collect(Collectors.toList());

    }

    @Override
    public Bottle getOneBottle(Long id) {
        return bottleMapper.toDto(bottleRepository.findOne(id));
    }
}
