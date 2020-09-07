package io.github.mwalasiak.Factory.training;

public class Car {

    private String engineCapacity;
    private String typeOfFuel;
    private String productionYear;

    public Car(final String engineCapacity, final String typeOfFuel, final String productionYear) {
        this.engineCapacity = engineCapacity;
        this.typeOfFuel = typeOfFuel;
        this.productionYear = productionYear;
    }
}
