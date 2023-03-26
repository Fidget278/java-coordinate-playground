package domain;

import domain.Car;

public class Sonata extends Car {
    private final int tripDistance;
    public Sonata(int tripDistance) {
        super();
        this.tripDistance = tripDistance;
    }

    @Override
    public double getDistancePerLiter() {
        return 10;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return "Sonata";
    }
}
