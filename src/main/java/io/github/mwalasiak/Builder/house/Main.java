package io.github.mwalasiak.Builder.house;

public class Main {

    public static void main(String[] args) {

        House house1 = new House.HouseBuilder()
                .buildWalls("walls")
                .buildRoof("roof")
                .buildRooms("rooms")
                .build();

        System.out.println(house1);
    }
}
