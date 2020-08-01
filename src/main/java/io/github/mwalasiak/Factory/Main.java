package io.github.mwalasiak.Factory;

import io.github.mwalasiak.Factory.unit.Factory;
import io.github.mwalasiak.Factory.unit.Unit;
import io.github.mwalasiak.Factory.unit.UnitFactory;
import io.github.mwalasiak.Factory.unit.UnitType;

public class Main {

    public static void main(String[] args) {

        Factory factory = new UnitFactory();
        Unit tank = factory.createUnit(UnitType.TANK);
        Unit riflemann = factory.createUnit(UnitType.RIFLEMANN);
    }
}
