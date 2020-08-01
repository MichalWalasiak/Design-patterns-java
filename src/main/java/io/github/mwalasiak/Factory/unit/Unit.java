package io.github.mwalasiak.Factory.unit;

public abstract class Unit {

    private int healthPoints;
    private int experience;
    private int damageDone;

    protected Unit(final int healthPoints, final int experience, final int damageDone) {
        this.healthPoints = healthPoints;
        this.experience = experience;
        this.damageDone = damageDone;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getExperience() {
        return experience;
    }

    public int getDamageDone() {
        return damageDone;
    }
}
