package io.github.mwalasiak.Flyway;

public class TeslaTank {


    private int x;
    private int y;
    private int hpLeft;
    private TeslaTankUnitStats teslastats;


    public TeslaTank(final int x, final int y) {
        teslastats = UnitStatsRepository.
        this.x = x;
        this.y = y;
        this.hpLeft = teslastats.getHp();

    }
}
