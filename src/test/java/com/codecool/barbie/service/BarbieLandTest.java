package com.codecool.barbie.service;

import com.codecool.barbie.model.doll.Doll;
import com.codecool.barbie.model.doll.barbie.StereotypicBarbie;
import com.codecool.barbie.model.doll.ken.Ken;
import com.codecool.barbie.model.house.BarbieHouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarbieLandTest {
    private final BarbieLand barbieLand = new BarbieLand();

    @Test
    void isNotDoomed() {
        BarbieHouse barbieHouse1 = new BarbieHouse();
        BarbieHouse barbieHouse2 = new BarbieHouse();
        Ken ken = new Ken();
        StereotypicBarbie sBarbie1 = new StereotypicBarbie(barbieHouse1);
        StereotypicBarbie sBarbie2 = new StereotypicBarbie(barbieHouse2);
        barbieLand.addDoll(ken);
        barbieLand.addDoll(sBarbie1);
        barbieLand.addDoll(sBarbie2);
        barbieLand.addHouse(barbieHouse1);
        barbieLand.addHouse(barbieHouse2);
        ken.visit(barbieHouse1);
        ken.visit(barbieHouse2);
        ken.visit(barbieHouse1);

        assertFalse(barbieLand.isDoomed());
    }
    @Test
    void isDoomed() {
        BarbieHouse barbieHouse1 = new BarbieHouse();
        BarbieHouse barbieHouse2 = new BarbieHouse();
        Ken ken = new Ken();
        barbieLand.addDoll(ken);
        barbieLand.addHouse(barbieHouse1);
        barbieLand.addHouse(barbieHouse2);
        ken.visit(barbieHouse1);
        ken.visit(barbieHouse2);
        ken.visit(barbieHouse1);

        assertTrue(barbieLand.isDoomed());
    }
}