package io.github.mwalasiak.Factory.unit;

public class BlueFactory extends Factory {

    @Override
    public InfantryUnit createInfantryUnit(final UnitType type) {

        switch (type){
            case RIFLEMANN:
                return new Riflemann(110, 0, 3);
            default:
                throw new UnsupportedOperationException("unknown unit type");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(final UnitType type) {

        switch (type){
            case TANK:
                return new Tank(130, 0, 13);
            default:
                throw new UnsupportedOperationException("unknown unit type");
        }
    }
}
