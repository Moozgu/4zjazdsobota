package pl.kodu.akademia.listy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> list = new LinkedList<>();
        List<Pet> list2 = new ArrayList<>();
//        list.add("cos");
//        list.add(5);
        list.add(new Car("BMW"));
        list2.add(new Pet("Tuptus"));
        System.out.println(list.get(0));
        System.out.println(list2.get(0));
//        System.out.println(((Car) list.get(2)).getBrand());
      //  System.out.println(((Car) list.get(3)).getBrand());

    /*    if (list.get(3) instanceof Car) {
            System.out.println("To jest auto!");
        } else if (list.get(3) instanceof Pet){
            System.out.println("To jest pet!");
        }*/
    }
}
