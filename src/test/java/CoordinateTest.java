import org.junit.jupiter.api.Test;
import domain.Coordinate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CoordinateTest {

    @Test
    void 좌표생성_유효성검사() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Coordinate(-1);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Coordinate(25);
        });

        assertThat((new Coordinate(0)).getValue()).isEqualTo(0);
        assertThat((new Coordinate(24)).getValue()).isEqualTo(24);
    }
}
