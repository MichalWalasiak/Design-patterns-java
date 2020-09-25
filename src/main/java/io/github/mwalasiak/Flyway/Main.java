package io.github.mwalasiak.Flyway;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> activeUnits = new ArrayList<>();

        for (int i = 0; i < 1000; i++){
            activeUnits.add(new TeslaTank("tesla1", 100, 50, 25, 40, 45, 150, 100));
            activeUnits.add(new Riflemann("rifle1", 50, 25, 15, 15, 10, 10, 5));
            activeUnits.add(new AircraftCarrier("Saratoga", 250, 400, 500, 50, 45, 45, 5000));
        }
    }
}
