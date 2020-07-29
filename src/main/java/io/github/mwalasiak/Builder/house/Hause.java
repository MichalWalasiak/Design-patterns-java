package io.github.mwalasiak.Builder.house;

public class Hause {

    private String walls;
    private String floors;
    private String roof;
    private String windows;
    private String doors;
    private String garage;

    public Hause(final String walls, final String floors, final String roof, final String windows, final String doors, final String garage) {
        this.walls = walls;
        this.floors = floors;
        this.roof = roof;
        this.windows = windows;
        this.doors = doors;
        this.garage = garage;
    }

    public Hause(final String walls, final String floors, final String roof) {
        this.walls = walls;
        this.floors = floors;
        this.roof = roof;
    }

    public Hause(final String walls, final String floors, final String roof, final String windows, final String doors) {
        this.walls = walls;
        this.floors = floors;
        this.roof = roof;
        this.windows = windows;
        this.doors = doors;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(final String walls) {
        this.walls = walls;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(final String floors) {
        this.floors = floors;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(final String roof) {
        this.roof = roof;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(final String windows) {
        this.windows = windows;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(final String doors) {
        this.doors = doors;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(final String garage) {
        this.garage = garage;
    }
}
