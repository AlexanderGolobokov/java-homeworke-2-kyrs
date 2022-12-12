package zadanie_10.prak_4_1;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plane plane = new Plane("super Jet", 2, 150, "buisness");
        Train train = new Train(12, "standart", "ussual");
        Car car = new Car(12000000, "BMW M5", 4, 850, 4.5);
        Ship ship = new Ship("origin", 1200, 2288282);
        System.out.println("how long will your ride?(in metrs)");
        double metr = scanner.nextDouble();
        System.out.println("\nOn plane in buisness class:");
        System.out.println(plane.costRide(metr) + "\n");
        System.out.println("\nOn plane in standart class:");
        plane.setCLASS("standart");
        System.out.println(plane.costRide(metr));
        System.out.println("\nOn train:");
        System.out.println(train.costRide(metr) + "\n");
        System.out.println("\nOn ship:\n");
        System.out.println(ship.costRide(metr) + "\n");
        System.out.println("\nOn car:\n");
        System.out.println(car.costRide(metr) + "\n");
    }
}
