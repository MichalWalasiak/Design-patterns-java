package io.github.mwalasiak.Flyway;

public class UnitStatsRepository {

    private static AircraftCarrierUnitStats carrierUnitStats = new AircraftCarrierUnitStats("Saratoga", 250, 400, 500, 50, 5000);
    private static TeslaTankUnitStats teslaTankUnitStats = new TeslaTankUnitStats("tesla1", 50, 25, 15, 15, 10);
    private static RiflemannUnitStats riflemannUnitStats = new RiflemannUnitStats("rifle1", 50, 25, 15, 15, 10);

    public UnitStatsRepository() {
    }

    public AircraftCarrierUnitStats getCarrierUnitStats() {
        return carrierUnitStats;
    }

    public TeslaTankUnitStats getTeslaTankUnitStats() {
        return teslaTankUnitStats;
    }
}
