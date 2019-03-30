package pl.kodu.akademia.maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"jeden");
        map.put(2,"dwa");
        map.put(3,"trzy");
        map.put(4,"cztery");
        map.put(5,"piec");
        System.out.println(map);


        System.out.println("Masz "+map.get(5)+" jablek");

        System.out.println(map.containsKey(3));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}
