package com.codecool.barbie.model.doll;

import com.codecool.barbie.model.house.BarbieHouse;

public class Resident extends Doll{
    protected BarbieHouse barbieHouse;

    public Resident(String name, BarbieHouse barbieHouse) {
        super(name);
        this.barbieHouse = barbieHouse;
    }
}
