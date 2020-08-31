package io.github.mwalasiak.Factory.unit;

public class RedFactory extends Factory {
    @Override
    public InfantryUnit createInfantryUnit(final UnitType type) {

        switch (type){
            case RIFLEMANN:
                return new Riflemann(100, 0, 5);
            default:
                throw new UnsupportedOperationException("unknown unit type");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(final UnitType type) {

        switch (type){
            case TANK:
                return new Tank(120, 0, 15);
            default:
                throw new UnsupportedOperationException("unknown unit type");
        }
    }

    @Override
    public AirUnit createAirUnit(final UnitType type) {

        switch (type){
            case FIGHTERJET:
                return new FighterJet(150, 0, 25);
            default:
                throw new UnsupportedOperationException("unknowb unit type");
        }
    }
}
