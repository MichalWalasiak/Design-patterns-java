package io.github.mwalasiak.Factory.training;

public interface Factory {

    Car buildFord(FordModel model);
    Car buildAudi(Audi model);
}
