package io.github.mwalasiak.Flyway;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> activeUnits = new ArrayList<>();

        for (int i = 0; i < 1000; i++){
            activeUnits.add(new TeslaTank());
            activeUnits.add(new Riflemann());
            activeUnits.add(new AircraftCarrier());
        }
    }
}
