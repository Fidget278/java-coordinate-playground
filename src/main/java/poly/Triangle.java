package poly;

import java.util.Arrays;

public class Triangle extends Points {

    public Triangle(Point[] points) {
        super(points);
        validatePointsNum(3);
    }

    @Override
    public double area() {
        double[] areas = Arrays.stream(Line.createLines(getPoints())).mapToDouble(Line::area).toArray();
        double s = Arrays.stream(areas).sum() / 2;
        return Math.sqrt(s * (s - areas[0]) * (s - areas[1]) * (s - areas[2]));
    }

    @Override
    public String areaString() {
        return "삼각형의 넓이는 " + area();
    }
}
