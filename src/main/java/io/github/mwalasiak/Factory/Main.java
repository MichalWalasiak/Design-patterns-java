package io.github.mwalasiak.Factory;

import io.github.mwalasiak.Factory.unit.InfantryFactory;
import io.github.mwalasiak.Factory.unit.InfantryUnit;
import io.github.mwalasiak.Factory.unit.UnitInfantryFactory;
import io.github.mwalasiak.Factory.unit.UnitType;

public class Main {

    public static void main(String[] args) {

        InfantryFactory infantryFactory = new UnitInfantryFactory();
        InfantryUnit tank = infantryFactory.createUnit(UnitType.TANK);
        InfantryUnit riflemann = infantryFactory.createUnit(UnitType.RIFLEMANN);
    }
}
