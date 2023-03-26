import domain.Car;
import domain.Cars;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private final List<Car> cars = new ArrayList<>();
    private static final String NEWLINE = System.lineSeparator();
    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        String colon = " : ";
        StringBuilder stringBuilder = new StringBuilder();

        for (Car car : cars) {
            stringBuilder.append(car.getName())
                    .append(colon)
                    .append((int)car.getChargeQuantity())
                    .append("리터")
                    .append(NEWLINE);
        }

        return stringBuilder.toString();
    }
}
