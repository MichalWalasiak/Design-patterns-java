package io.github.mwalasiak.Factory;

import io.github.mwalasiak.Factory.unit.*;

public class Main {

    public static void main(String[] args) {

        BlueFactory blueFactory = new BlueFactory();
        RedFactory redFactory = new RedFactory();

        InfantryUnit blueRiflemann = blueFactory.createInfantryUnit(UnitType.RIFLEMANN);
        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        AirUnit blueFighterJet = blueFactory.createAirUnit(UnitType.FIGHTERJET);

        InfantryUnit redRiflemann = redFactory.createInfantryUnit(UnitType.RIFLEMANN);
        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        AirUnit redFighterJet = redFactory.createAirUnit(UnitType.FIGHTERJET);


    }
}
