package io.github.mwalasiak.Factory.training;

public class Main {

    public static void main(String[] args) {

        Factory continentalFactory = new ContinentalFactory();
        Factory commonWheelFactory = new CommonWheelFactory();

        Car ford = continentalFactory.buildFord(FordModel.MUSTANG);
        System.out.println(ford.getPosition());

        Car audi = commonWheelFactory.buildAudi(AudiModel.SQ7);
        System.out.println(audi.getPosition());


    }
}
