package collections;

import java.util.Arrays;
import java.util.Collections;

public class Car implements Comparable<Car> {

    private Object model;

    public Car(String brand, int model) {
    }

    Car[] cars = {new Car("Honda", 2019),
            new Car("Tesla", 2000),
            new Car("Audi", 1995),
            new Car("Mini", 2006)
    };



    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
