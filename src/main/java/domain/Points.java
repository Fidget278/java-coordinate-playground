package domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Points implements Area {

    private static final int NUM_OF_VERTICES_OF_LINE = 2;
    private static final int NUM_OF_VERTICES_OF_TRIANGLE = 3;
    private static final int NUM_OF_VERTICES_OF_RECTANGLE = 4;
    private static final Map<Integer, Function<Point[], Points>> classifier = new HashMap<>();

    private Point[] points;

    static {
        classifier.put(NUM_OF_VERTICES_OF_LINE, Line::new);
        classifier.put(NUM_OF_VERTICES_OF_TRIANGLE, Triangle::new);
        classifier.put(NUM_OF_VERTICES_OF_RECTANGLE, Rectangle::new);
    }


    public Points(Point[] points) {
        this.points = points;
    }

    protected void validatePointsNum(int num) {
        if(points.length < num)
            throw new IllegalArgumentException("점 갯수가 충분하지 않습니다.");
    }

    public Point getPoint(int index) {
        return points[index];
    }

    public Point[] getPoints() {
        return Arrays.copyOf(points, points.length);
    }

    public static Points create(Point[] points) {
        if(points.length == 0 || points.length > 4)
            throw new IllegalArgumentException("선, 삼각형, 사각형만 생성 가능합니다. 알맞은 갯수의 좌표를 입력하세요.");

        return classifier.get(points.length).apply(points);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String areaString() {
        return null;
    }
}
