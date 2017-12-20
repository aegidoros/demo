package com.example.demo.controller;

import com.example.demo.entities.BottleEntity;
import com.example.demo.model.Bottle;
import com.example.demo.respositories.BottleRepository;
import com.example.demo.service.BottleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bottles/")
public class BottleController {

    private final BottleService bottleService;
    private final BottleRepository bottleRepository;

    @Autowired
    public BottleController(BottleService bottleService, BottleRepository bottleRepository) {
        this.bottleService=bottleService;
        this.bottleRepository = bottleRepository;
    }

    @GetMapping("/")
    public List<Bottle> getAllBottles() {
        return bottleService.getBottles();
    }

}
