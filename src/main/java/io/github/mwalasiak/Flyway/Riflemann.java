package io.github.mwalasiak.Flyway;

public class Riflemann {


    private int x;
    private int y;
    private int hpLeft;
    private UnitStats rifleStats;


    public Riflemann(final int x, final int y) {
        rifleStats = UnitStatsRepository.getRiflemannUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = rifleStats.getHp();

    }
}
