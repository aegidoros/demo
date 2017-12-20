package com.example.demo.respositories;

import com.example.demo.entities.BottleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BottleRepository extends CrudRepository<BottleEntity, Long> {
}
