package poly;

public class Rectangle extends Points {
    private static final int LEFT_BOTTOM = 0;
    private static final int RIGHT_BOTTOM = 1;
    private static final int RIGHT_TOP = 2;
    private static final int LEFT_TOP = 3;

    public Rectangle(Point[] points) {
        super(points);
        validatePointsNum(4);
    }

    public double getWidth() {
        return Math.abs(getPoint(LEFT_BOTTOM).getX() - getPoint(RIGHT_BOTTOM).getX());
    }

    public double getHeight() {
        return Math.abs(getPoint(LEFT_TOP).getY() - getPoint(LEFT_BOTTOM).getY());
    }

    @Override
    public double area() {
        return getWidth() * getHeight();
    }

    @Override
    public String areaString() {
        return "사각형의 넓이는 " + area();
    }
}
