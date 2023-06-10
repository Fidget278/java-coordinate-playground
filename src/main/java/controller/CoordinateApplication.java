package controller;

import domain.Point;
import domain.Points;
import ui.InputView;
import ui.ResultView;

public class CoordinateApplication {
    public static void main(String[] args) {
        Point[] points = InputView.getInstance().startView();
        Points poly = Points.create(points);
        ResultView.getInstance().printGraph(poly);
        ResultView.getInstance().printArea(poly);
    }
}
