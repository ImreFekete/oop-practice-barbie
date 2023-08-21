package com.codecool.barbie.model.doll.barbie;

import com.codecool.barbie.model.Visit;
import com.codecool.barbie.model.doll.Doll;
import com.codecool.barbie.model.doll.Resident;
import com.codecool.barbie.model.house.BarbieHouse;

public abstract class Barbie extends Resident implements Visit {
    private String job;

    public Barbie(String name, String job, BarbieHouse barbieHouse) {
        super(name, barbieHouse);
        this.job = job;
    }
    @Override
    public void visit(BarbieHouse barbieHouse) {
        this.barbieHouse.moveOutDoll(this);
        barbieHouse.moveInDoll(this);
        this.barbieHouse = barbieHouse;
    }
}
