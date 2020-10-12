package io.github.mwalasiak.Flyway;

public class UnitStatsRepository {

    private static AircraftCarrierUnitStats carrierUnitStats = new AircraftCarrierUnitStats("Saratoga", 250, 400, 500, 50, 5000);

    public UnitStatsRepository() {
    }

    public AircraftCarrierUnitStats getCarrierUnitStats() {
        return carrierUnitStats;
    }
}
