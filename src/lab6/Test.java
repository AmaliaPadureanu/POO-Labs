package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Car bmw = new Car(Car.CarType.BMW, 10000, 2020);
        Car audi = new Car(Car.CarType.AUDI, 20000, 2015);
        Car ford = new Car(Car.CarType.FORD, 30000, 2010);

        Dealership dealership = new Dealership();

        Offer clientOffer = new Offer() {
            @Override
            public int getDiscount(Car car) {
                System.out.println("Client's offer: " + 200);
                return 200;
            }
        };

        dealership.getFinalPrice(bmw);
        dealership.negotiate(bmw, clientOffer);

        List<Car> carList = new ArrayList<>(Arrays.asList(bmw, audi, ford));
        System.out.println(carList);
        carList.removeIf((c) -> c.getPrice() > 10000);
        System.out.println(carList);
    }
}
