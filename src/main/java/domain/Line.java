package domain;

import java.util.ArrayList;
import java.util.List;

public class Line extends Points {
    private static final int START = 0;
    private static final int END = 1;

    public Line(Point[] points) {
        super(points);
        validatePointsNum(2);
    }

    public static Line[] createLines(Point[] points) {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < points.length-1; ++i) {
            Point[] pointArray = new Point[] {points[i], points[i+1]};
            lines.add(new Line(pointArray));
        }

        Point[] pointArray = new Point[] {points[points.length-1], points[0]};
        lines.add(new Line(pointArray));

        return lines.toArray(new Line[lines.size()]);
    }

    public Point getStart() {
        return getPoint(START);
    }

    public Point getEnd() {
        return getPoint(END);
    }

    @Override
    public double area() {
        return Math.sqrt(
                Math.pow(getEnd().getX() - getStart().getX(), 2.0)
                + Math.pow(getEnd().getY() - getStart().getY(), 2.0)
        );
    }

    @Override
    public String areaString() {
        return "두 점 사이의 거리는 " + area();
    }
}
