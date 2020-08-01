package io.github.mwalasiak.Factory;

import io.github.mwalasiak.Factory.unit.Factory;
import io.github.mwalasiak.Factory.unit.InfantryUnit;
import io.github.mwalasiak.Factory.unit.UnitFactory;
import io.github.mwalasiak.Factory.unit.UnitType;

public class Main {

    public static void main(String[] args) {

        Factory factory = new UnitFactory();
        InfantryUnit tank = factory.createUnit(UnitType.TANK);
        InfantryUnit riflemann = factory.createUnit(UnitType.RIFLEMANN);
    }
}
