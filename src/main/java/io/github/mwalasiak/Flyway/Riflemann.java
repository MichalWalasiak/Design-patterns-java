package io.github.mwalasiak.Flyway;

public class Riflemann {


    private int x;
    private int y;
    private int hpLeft;
    private RiflemannUnitStats riflemannUnitStats;


    public Riflemann(final int x, final int y) {
        riflemannUnitStats = UnitStatsRepository.
        this.x = x;
        this.y = y;
        this.hpLeft = riflemannUnitStats.getHp();

    }
}
