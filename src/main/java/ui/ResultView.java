package ui;

import domain.Area;
import domain.Point;
import domain.Points;

import java.util.Arrays;

public class ResultView {
    private static final ResultView resultView = new ResultView();
    private ResultView() {}

    public static ResultView getInstance() {
        return resultView;
    }

    public void printArea(Area area) {
        System.out.println(area.areaString());
    }
    public void printGraph(Points points) {
        Point[] pointArray = points.getPoints();
        Arrays.sort(pointArray);

        printYaxis(pointArray);
        printXaxis();
        System.out.println();
    }

    private void printYaxis(Point[] points) {
        for(int i = 24; i > 0; --i) {
            System.out.print(selectPrint(i));
            System.out.print("|");
            drawPoints(points, i);
            System.out.println();
        }
    }

    private void printXaxis() {
        System.out.print("  +");

        for(int i = 1; i <= 24; ++i)
            System.out.print("──");

        System.out.println();

        for(int i = 0; i <= 24; ++i)
            System.out.print(selectPrint(i));
    }

    private String selectPrint(Integer num) {
        if(num % 2 == 0)
            return String.format("%2d", num);

        return "  ";
    }

    private void drawPoints(Point[] points, int y) {
        int xCursor = 1;
        for (Point p : points)
            xCursor = drawPoint(p, y, xCursor);
    }

    private int drawPoint(Point point, int y, int xCursor) {
        if(point.getY() != y)
            return xCursor;

        for(int i = xCursor; i < point.getX(); ++i)
            System.out.print("  ");

        System.out.print(".");
        return point.getX();
    }

}
