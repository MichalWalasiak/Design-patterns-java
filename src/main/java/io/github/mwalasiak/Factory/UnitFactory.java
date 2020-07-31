package io.github.mwalasiak.Factory;

import javax.lang.model.type.TypeKind;

public class UnitFactory extends Factory {
    @Override
    public Unit createUnit(UnitType type) {

        switch (type) {
            case TANK:
                return new Tank(200, 0, 20);
            case RIFLEMANN:
                return new Riflemann(100, 10, 5);
            default:
                throw new UnsupportedOperationException("no such type");
        }
    }
}
