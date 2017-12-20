package com.example.demo.service;

import com.example.demo.model.Bottle;

import java.util.List;

public interface BottleService {

    List<Bottle> getBottles ();

    Bottle getOneBottle(Long id);
}
