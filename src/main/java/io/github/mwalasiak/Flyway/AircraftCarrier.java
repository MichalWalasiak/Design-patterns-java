package io.github.mwalasiak.Flyway;

public class AircraftCarrier {

    private int x;
    private int y;
    private int hpLeft;
    private AircraftCarrierUnitStats carrierUnitStats;

    public AircraftCarrier(final int x, final int y) {

        this.x = x;
        this.y = y;
        this.hpLeft = carrierUnitStats.getHp();
    }
}
