package com.codecool.barbie.model.doll.ken;

import com.codecool.barbie.model.Eviction;
import com.codecool.barbie.model.Visit;
import com.codecool.barbie.model.doll.Doll;
import com.codecool.barbie.model.doll.Resident;
import com.codecool.barbie.model.house.BarbieHouse;

public class Ken extends Resident implements Visit, Eviction {
    private String job;
    private boolean hasKnowledge;
    private int countUntilMadness;

    public Ken() {
        super("Ken", null);
        this.job = "Beach";
        this.hasKnowledge = false;
        this.countUntilMadness = 0;
    }

    public boolean isHasKnowledge() {
        return hasKnowledge;
    }

    @Override
    public void visit(BarbieHouse barbieHouse) {
        if(this.barbieHouse != null) this.barbieHouse.moveOutDoll(this);
        barbieHouse.moveInDoll(this);
        this.barbieHouse = barbieHouse;
        this.countUntilMadness++;

        if (countUntilMadness == 3){
            this.countUntilMadness = 0;
            barbieHouse.cullTheWeak();
            barbieHouse.setName("Ken’s Mojo Dojo Casa House");
            job = "Patriarchy";
            hasKnowledge = true;
        }
    }

    @Override
    public void getEvicted() {
        this.barbieHouse.moveOutDoll(this);
        barbieHouse = null;
    }
}
