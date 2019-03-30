package pl.kodu.akademia.listy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> list = new LinkedList<>();
//        List<Pet> list2 = new ArrayList<>();
//        list.add("cos");
//        list.add(5);
        list.add(new Car("BMW", 1999));
        list.add(new Car("BMW", 2045));
        list.add(new Car("BMW", 1922));
        list.add(new Car("BMW", 1995));
        list.add(new Car("BMW", 1923));
        list.add(new Car("BMW", 2014));
        list.add(new Car("BMW", 1997));

        List<Car> list2 = new ArrayList<>();
        list2.add(new Car("Audi",2000));
        list2.add(new Car("Peugot",2000));

        list.addAll(list2);

        list.remove (1);

        Car c = list.get(3);
        if(c.getBrand().equals("BMW")){
            list.remove(c);
        }


        for (Car car : list) {
            System.out.println(car);

        }

//        Iterator i = list.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }

//        list2.add(new Pet("Tuptus"));
//        System.out.println(list.get(0));
//        System.out.println(list2.get(0));
//        System.out.println(((Car) list.get(2)).getBrand());
//     System.out.println(((Car) list.get(3)).getBrand());
//
//        if (list.get(3) instanceof Car) {
//            System.out.println("To jest auto!");
//        } else if (list.get(3) instanceof Pet){
//            System.out.println("To jest pet!");
//        }
    }
}
