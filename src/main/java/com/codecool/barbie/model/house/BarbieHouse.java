package com.codecool.barbie.model.house;

import com.codecool.barbie.model.Eviction;
import com.codecool.barbie.model.doll.Doll;
import com.codecool.barbie.model.doll.barbie.StereotypicBarbie;
import com.codecool.barbie.model.doll.ken.Ken;

import java.util.HashSet;
import java.util.Set;

public class BarbieHouse {
    private final Set<Doll> dolls;
    private String name;

    public BarbieHouse() {
        this.dolls = new HashSet<>();
        name = "Barbie’s Dream House";
    }

    public void moveInDoll(Doll doll) {
        dolls.add(doll);
    }

    public void moveOutDoll(Doll doll) {
        dolls.remove(doll);
    }

    public void cullTheWeak() {
        dolls.stream()
                .filter(doll -> doll instanceof StereotypicBarbie)
                .forEach(doll -> ((Eviction) doll).getEvicted());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int BarbiesWithKnowledge() {
        return dolls.stream()
                .filter(doll -> doll instanceof StereotypicBarbie)
                .filter(doll -> ((StereotypicBarbie) doll).isHasKnowledge())
                .toList().size();
    }

    public int KensWithKnowledge() {
        return (int) dolls.stream()
                .filter(doll -> doll instanceof Ken && ((Ken) doll).isHasKnowledge()).count();
    }
}
