package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "bottle")
public class BottleEntity {

    @Id
    private long id;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private String region;
}
