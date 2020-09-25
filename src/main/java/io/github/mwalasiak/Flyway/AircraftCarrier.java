package io.github.mwalasiak.Flyway;

public class AircraftCarrier {

    private String name;
    private int hp;
    private int armour;
    private int damageDelt;
    private int x;
    private int y;
    private int speed;
    private int hpLeft;
    private int resourceCost;

    public AircraftCarrier(final String name, final int hp, final int armour, final int damageDelt, final int x, final int y, final int speed, final int resourceCost) {
        this.name = name;
        this.hp = hp;
        this.armour = armour;
        this.damageDelt = damageDelt;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.hpLeft = hp;
        this.resourceCost = resourceCost;
    }
}
