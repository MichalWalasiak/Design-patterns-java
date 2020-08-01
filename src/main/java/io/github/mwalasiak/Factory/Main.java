package io.github.mwalasiak.Factory;

public class Main {

    public static void main(String[] args) {

        Factory factory = new UnitFactory();
        Unit tank = factory.createUnit(UnitType.TANK);
        Unit riflemann = factory.createUnit(UnitType.RIFLEMANN);
    }
}
