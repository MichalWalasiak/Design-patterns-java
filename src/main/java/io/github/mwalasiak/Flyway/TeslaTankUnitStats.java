package io.github.mwalasiak.Flyway;

public class TeslaTankUnitStats {

    private String name;
    private int speed;
    private int resourceCost;
    private int hp;
    private int armour;
    private int damageDelt;

    public TeslaTankUnitStats(final String name, final int speed, final int resourceCost, final int hp, final int armour, final int damageDelt) {
        this.name = name;
        this.speed = speed;
        this.resourceCost = resourceCost;
        this.hp = hp;
        this.armour = armour;
        this.damageDelt = damageDelt;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getResourceCost() {
        return resourceCost;
    }

    public int getHp() {
        return hp;
    }

    public int getArmour() {
        return armour;
    }

    public int getDamageDelt() {
        return damageDelt;
    }
}
