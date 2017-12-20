package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class Bottle implements Serializable {

    private static final long serialVersionUID = 4124677978846692888L;

    @JsonProperty (required = true)
    private long id;

    @JsonProperty (required = true)
    private String name;

    @JsonProperty (required = true)
    private String region;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bottle bottle = (Bottle) o;
        return id == bottle.id &&
                Objects.equals(name, bottle.name) &&
                Objects.equals(region, bottle.region);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, name, region);
    }

}
