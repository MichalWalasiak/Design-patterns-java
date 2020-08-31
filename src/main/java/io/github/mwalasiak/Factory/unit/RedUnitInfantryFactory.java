package io.github.mwalasiak.Factory.unit;

public class RedUnitInfantryFactory extends InfantryFactory {
    @Override
    public InfantryUnit createUnit(UnitType type) {

        switch (type) {
            case TANK:
                return new Tank(200, 0, 20);
            case RIFLEMANN:
                return new Riflemann(20, 10, 6);
            default:
                throw new UnsupportedOperationException("no such type");
        }
    }
}
