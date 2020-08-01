package io.github.mwalasiak.Factory.unit;

public class MechanizedUnit {

    private int healthPoints;
    private int experience;
    private int damageDone;

    protected MechanizedUnit(final int healthPoints, final int experience, final int damageDone) {
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
