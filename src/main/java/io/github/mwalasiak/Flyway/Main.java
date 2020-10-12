package io.github.mwalasiak.Flyway;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> activeUnits = new ArrayList<>();

        for (int i = 0; i < 1000; i++){
            activeUnits.add(new TeslaTank(0,0));
            activeUnits.add(new Riflemann( 0, 0));
            activeUnits.add(new AircraftCarrier( 0, 0));
        }
    }
}
