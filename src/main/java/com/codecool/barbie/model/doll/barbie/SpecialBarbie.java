package com.codecool.barbie.model.doll.barbie;

import com.codecool.barbie.model.house.BarbieHouse;

public class SpecialBarbie extends Barbie{
    public SpecialBarbie(String job, BarbieHouse barbieHouse) {
        super(job + " Barbie", job, barbieHouse);
    }
}
