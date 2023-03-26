package domain;

public class Avante extends Car {
    private final int tripDistance;

    public Avante(int tripDistance) {
        super();
        this.tripDistance = tripDistance;
    }

    @Override
    public double getDistancePerLiter() {
        return 15;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return "Avante";
    }
}
