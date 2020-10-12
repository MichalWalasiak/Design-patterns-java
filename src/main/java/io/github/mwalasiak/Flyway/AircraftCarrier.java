package io.github.mwalasiak.Flyway;

public class AircraftCarrier {

    private int x;
    private int y;
    private int hpLeft;
    private AircraftCarrierUnitStats carrierUnitStats;

    public AircraftCarrier(final int x, final int y, final AircraftCarrierUnitStats carrierUnitStats) {

        this.x = x;
        this.y = y;
        this.carrierUnitStats = carrierUnitStats;
        this.hpLeft = carrierUnitStats.getHp();
    }
}
