package ui;

import poly.Point;

import java.util.Arrays;
import java.util.Scanner;

public class InputView {
    private static final InputView inputView = new InputView();
    private InputView() {}

    public static InputView getInstance() {
        return inputView;
    }
    public Point[] parseCoordinate(String info) {
        String[] infos = info
                .replace("(", "")
                .replace(")", "")
                .split("-");

        return Arrays.stream(infos)
                .map(Point::new)
                .toArray(Point[]::new);
    }

    public Point[] startView() {
        System.out.println("좌표를 입력하세요.");
        return parseCoordinate(input());
    }

    private String input() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        scanner.close();
        return inputString;
    }
}
