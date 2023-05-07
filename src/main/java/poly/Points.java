package poly;

import java.util.Arrays;

public class Points implements Area {
    private Point[] points;

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

        if(points.length > 3)
            return new Rectangle(points);

        if(points.length > 2)
            return new Triangle(points);

        return new Line(points);
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
