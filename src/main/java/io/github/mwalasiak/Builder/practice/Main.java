package io.github.mwalasiak.Builder.practice;

public class Main {

    public static void main(String[] args) {

        FlightLeg flightLeg = new FlightLeg.FlightLegBuilder()
                .buildFrom("Las Vegas")
                .buildTo("Los Angeles")
                .buildPrice(50)
                .build();

        System.out.println(flightLeg);
    }
}
