package coordinate;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Stream;

enum FigureEnum {
    LINE(2, Line.class),
    TRIANGLE(3, Triangle.class),
    RECTANGLE(4, Rectangle.class);

    private int size;
    private Class<? extends AbstractFigure> figureClass;

    FigureEnum(int size, Class<? extends AbstractFigure> figureClass) {
        this.size = size;
        this.figureClass = figureClass;
    }

    public static Class<?> getFigureClass(int size) {
        return Stream.of(FigureEnum.values())
                .filter(val -> val.size == size)
                .findFirst()
                .map(val -> val.figureClass)
                .orElseThrow(() -> new IllegalArgumentException("Invalid size: " + size));
    }
}

public class FigureFactory {
    static Figure getInstance(List<Point> points) {
        try {
            return (Figure) FigureEnum.getFigureClass(points.size()).getDeclaredConstructor(List.class).newInstance(points);
        } catch (Exception e) {
            throw new IllegalArgumentException("잘못된 도형임");
        }
    }
}
