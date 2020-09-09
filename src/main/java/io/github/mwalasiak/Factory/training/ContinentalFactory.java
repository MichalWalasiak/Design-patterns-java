package io.github.mwalasiak.Factory.training;

public class ContinentalFactory implements Factory {

    SteringWheelPosition position = SteringWheelPosition.LEFT;
    @Override
    public Car buildFord(final FordModel model) {
        switch(model){
            case FOCUS:
                return new Ford("2000", "Gasoline", "2018", position);
            case MUSTANG:
                return new Ford("3200", "Gasoline", "2020", position);
            default:
                throw new IllegalArgumentException("unknown model");
        }
    }

    @Override
    public Car buildAudi(final AudiModel model) {
        switch(model) {
            case Q7:
                return new Audi("3000", "Diesel", "2019", position);
            case SQ7:
                return new Audi("4000", "Diesel", "2020", position);
            default:
                throw new IllegalArgumentException("unknown model");
        }
    }
}
