package io.github.mwalasiak.Factory.training;

public class Car {

    private String engineCapacity;
    private String typeOfFuel;
    private String productionYear;
    private SteringWheelPosition position;

    protected Car(final String engineCapacity, final String typeOfFuel, final String productionYear, final String steringWheelPosition) {
        this.engineCapacity = engineCapacity;
        this.typeOfFuel = typeOfFuel;
        this.productionYear = productionYear;
        this.steringWheelPosition = steringWheelPosition;
    }

    public SteringWheelPosition getPosition() {
        return position;
    }
}
