package io.github.mwalasiak.Factory.training;

public abstract class Car {

    private String engineCapacity;
    private String typeOfFuel;
    private String productionYear;
    private SteringWheelPosition position;

    protected Car(final String engineCapacity, final String typeOfFuel, final String productionYear, final SteringWheelPosition position) {
        this.engineCapacity = engineCapacity;
        this.typeOfFuel = typeOfFuel;
        this.productionYear = productionYear;
        this.position = position;
    }

    public SteringWheelPosition getPosition() {
        return position;
    }
}
