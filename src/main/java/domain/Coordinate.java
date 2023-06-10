package domain;

public class Coordinate {
    private int value;

    public Coordinate(int point) {
        setValue(point);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value < 0 || value > 24)
            throw new IllegalArgumentException("Point out of range (0 ~ 24)");

        this.value = value;
    }
}
