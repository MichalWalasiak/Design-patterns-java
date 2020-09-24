package io.github.mwalasiak.Factory.training;

public class CommonWheelFactory implements Factory {

    SteringWheelPosition position = SteringWheelPosition.RIGHT;
    @Override
    public Car buildFord(final FordModel model) {
        return null;
    }

    @Override
    public Car buildAudi(final AudiModel model) {
        return null;
    }
}
