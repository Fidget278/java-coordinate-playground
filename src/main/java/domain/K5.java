package domain;

import domain.Car;

public class K5 extends Car {
    private final int tripDistance;

    public K5(int tripDistance) {
        super();
        this.tripDistance = tripDistance;
    }

    @Override
    public double getDistancePerLiter() {
        return 13;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return "K5";
    }
}
