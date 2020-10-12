package io.github.mwalasiak.Flyway;

public class AircraftCarrier {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats carrierStats;

    public AircraftCarrier(final int x, final int y) {
        this.carrierStats = UnitStatsRepository.getCarrierUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = carrierStats.getHp();
    }
}
