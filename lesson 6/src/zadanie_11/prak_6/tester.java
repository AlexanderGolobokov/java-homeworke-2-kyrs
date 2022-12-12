package zadanie_11.prak_6;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;
        System.out.println("Enter temperature in kelvin:\n");
        temperature = scanner.nextDouble();
        System.out.println("\ntemperature in faringate:\n" + Temperature.K2F(temperature) + " K");
        System.out.println("Enter temperature in faringate:\n");
        temperature = scanner.nextDouble();
        System.out.println("\ntemperature in kelvin:\n" + Temperature.F2K(temperature) + " F");
    }
}
