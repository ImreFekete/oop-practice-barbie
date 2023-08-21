package com.codecool.barbie.model.doll.barbie;

import com.codecool.barbie.model.Eviction;
import com.codecool.barbie.model.house.BarbieHouse;

public class StereotypicBarbie extends Barbie implements Eviction {
    private boolean hasKnowledge;
    public StereotypicBarbie(BarbieHouse barbieHouse) {
        super("Barbie", "unemployed", barbieHouse);
        hasKnowledge = false;
    }

    @Override
    public void getEvicted() {
        hasKnowledge = true;
        this.barbieHouse.moveOutDoll(this);
        this.barbieHouse = null;
    }

    public boolean isHasKnowledge() {
        return hasKnowledge;
    }
}
