package pl.kodu.akademia.sety;

import com.sun.source.tree.WhileLoopTree;
import pl.kodu.akademia.listy.Car;

import java.util.*;

public class Main {
    /*
    public static void main(String[] args) {
        Car a = new Car("BMW", 1999);
        Car b = new Car("BMW", 1999);
//        Car b = a;

//        a.setBrand("Audi");

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
    */
    public static void main(String[] args) {
        List<Car> set = new ArrayList<>();

        set.add(new Car("BMW",2000));
        set.add(new Car("BMW",2001));
        set.add(new Car("BMW",2002));
        set.add(new Car("Audi",2000));
        set.add(new Car("Audi",2001));
        set.add(new Car("Audi",2002));
        set.add(new Car("Peugot",2000));
        set.add(new Car("Peugot",2001));
        set.add(new Car("Peugot",2002));

        System.out.println(set);

        set.sort(new CarComparator()); //sortuje rosnaco uzywajac CarComparator
        System.out.println(set);


        set.sort(new CarComparatorReversed()); // sortuje malejaco uzywajac CarComparatorReversed
        System.out.println(set);
    }
}
