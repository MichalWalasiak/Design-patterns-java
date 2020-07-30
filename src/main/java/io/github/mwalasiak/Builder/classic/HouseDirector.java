package io.github.mwalasiak.Builder.classic;

public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(final HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.buildWalls();
        houseBuilder.buildRooms();
        houseBuilder.buildFloors();
        houseBuilder.buildRoof();
        houseBuilder.buildDoors();
        houseBuilder.buildWindows();
        houseBuilder.buildGarage();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
}
