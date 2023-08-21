package com.codecool.barbie.model.doll;

import com.codecool.barbie.model.house.BarbieHouse;

public abstract class Doll {
    private final String name;

    public Doll(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
