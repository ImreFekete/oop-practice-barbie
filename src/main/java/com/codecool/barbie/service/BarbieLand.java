package com.codecool.barbie.service;

import com.codecool.barbie.model.doll.Doll;
import com.codecool.barbie.model.house.BarbieHouse;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BarbieLand {
    private final Set<BarbieHouse> houses;
    private final Set<Doll> dolls;

    public BarbieLand() {
        this.houses = new HashSet<>();
        this.dolls = new HashSet<>();
    }
    public void addHouse(BarbieHouse barbieHouse){
        houses.add(barbieHouse);
    }
    public void addDoll(Doll doll){
        dolls.add(doll);
    }
    public boolean isDoomed(){
        return NumberOfKensWithKnowledge() > NumberOfBarbiesWithKnowledge();
    }

    private int NumberOfKensWithKnowledge() {
            int acc = 0;
            for (BarbieHouse house : houses) {
                acc = house.KensWithKnowledge();
            }
            return acc;
    }
    /*private int NumberOfBarbiesWithKnowledge() {
     return houses.stream().reduce(0, BarbieHouse::BarbiesWithKnowledge);
    }*/
    private int NumberOfBarbiesWithKnowledge() {
        int acc = 0;
        for (BarbieHouse house : houses) {
            acc = house.BarbiesWithKnowledge();
        }
        return acc;
    }
}
