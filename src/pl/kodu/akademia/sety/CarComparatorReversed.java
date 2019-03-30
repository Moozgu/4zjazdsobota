package pl.kodu.akademia.sety;

import pl.kodu.akademia.listy.Car;

import java.util.Comparator;

public class CarComparatorReversed implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getYear() - o1.getYear();
    }
}
