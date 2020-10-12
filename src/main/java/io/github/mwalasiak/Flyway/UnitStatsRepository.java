package io.github.mwalasiak.Flyway;

public class UnitStatsRepository {

    private static UnitStats carrierUnitStats = new UnitStats("Saratoga", 250, 400, 500, 50, 5000);
    private static UnitStats unitStats = new UnitStats("tesla1", 50, 25, 15, 15, 10);
    private static UnitStats riflemannUnitStats = new UnitStats("rifle1", 50, 25, 15, 15, 10);

    public UnitStatsRepository() {
    }

    public static UnitStats getCarrierUnitStats() {
        return carrierUnitStats;
    }

    public static UnitStats getTeslaTankUnitStats() {
        return unitStats;
    }

    public static UnitStats getRiflemannUnitStats() {
        return riflemannUnitStats;
    }
}
