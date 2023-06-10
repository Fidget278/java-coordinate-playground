package domain;

public class Point implements Comparable<Point> {
    private Coordinate x;
    private Coordinate y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point(String coordinate) {
        String[] coordinates = coordinate.split(",");

        setX(Integer.parseInt(coordinates[0]));
        setY(Integer.parseInt(coordinates[1]));
    }

    public void setX(int x) {
        this.x = new Coordinate(x);
    }

    public void setY(int y) {
        this.y = new Coordinate(y);
    }

    public int getX() {
        return x.getValue();
    }

    public int getY() {
        return y.getValue();
    }

    @Override
    public int compareTo(Point other) {
        return Integer.compare(this.x.getValue(), other.x.getValue());
    }
}
