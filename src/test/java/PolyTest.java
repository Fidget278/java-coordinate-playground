import org.junit.jupiter.api.Test;
import domain.*;
import ui.InputView;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class PolyTest {

    @Test
    void 생성테스트() {
        Points line = Points.create(InputView.getInstance().parseCoordinate("(10,10)-(14,15)"));
        assertThat(line).isInstanceOf(Line.class);

        Points rectangle = Points.create(InputView.getInstance().parseCoordinate("(10,10)-(22,10)-(22,18)-(10,18)"));
        assertThat(rectangle).isInstanceOf(Rectangle.class);

        Points triangle = Points.create(InputView.getInstance().parseCoordinate("(10,10)-(14,15)-(20,8)"));
        assertThat(triangle).isInstanceOf(Triangle.class);
    }

    @Test
    void 두점사이의거리() {
        Points points = Points.create(InputView.getInstance().parseCoordinate("(10,10)-(14,15)"));
        assertThat(points.area()).isEqualTo(6.403124, offset(0.001));
    }

    @Test
    void 사각형넓이() {
        Points points = Points.create(InputView.getInstance().parseCoordinate("(10,10)-(22,10)-(22,18)-(10,18)"));
        assertThat(points.area()).isEqualTo(96.0, offset(0.001));
    }

    @Test
    void 삼각형넓이() {
        Points points = Points.create(InputView.getInstance().parseCoordinate("(10,10)-(14,15)-(20,8)"));
        assertThat(points.area()).isEqualTo(29.0, offset(0.001));
    }
}
