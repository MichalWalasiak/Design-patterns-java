package io.github.mwalasiak.Flyway;

public class TeslaTank {


    private int x;
    private int y;
    private int hpLeft;
    private UnitStats teslastats;


    public TeslaTank(final int x, final int y) {
        teslastats = UnitStatsRepository.getTeslaTankUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = teslastats.getHp();

    }
}
