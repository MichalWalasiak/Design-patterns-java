package io.github.mwalasiak.Factory.unit;

public abstract class Factory {

    public abstract InfantryUnit createInfantryUnit(UnitType type);
    public abstract MechanizedUnit createMechanizedUnit(UnitType type);
    public abstract AirUnit createAirUnit(UnitType type);

}
