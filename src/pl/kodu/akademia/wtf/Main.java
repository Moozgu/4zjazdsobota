package pl.kodu.akademia.wtf;

public class Main {
    public static void main(String[] args) {
        Fast c = new Car(); // or Car c = new Car():   -> Polimorphism at it's best, since Car implements Fast, Fast is also a Car.
        c.driveFast();

        Fast b = new Bicycle();
        b.driveFast();

        Fast f = new Fast(){

            @Override
            public void driveFast() {
                System.out.println("Jade szybko anonimowo");
            }
        };
        f.driveFast();
    }
}
