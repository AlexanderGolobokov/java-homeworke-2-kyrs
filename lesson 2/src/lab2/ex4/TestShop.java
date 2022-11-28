package lab2.ex4;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PC pc = new PC("", "", "", "");
        Shop shop = new Shop();



        while (true) {
            System.out.println("Введите команду (add, delete, search, array или exit - что бы выйти): ");
            String s = scanner.nextLine();
            if (s.equals("add")) {
                shop.addPC();
            } else if (s.equals("delete")) {
                shop.deletePC();
            } else if (s.equals("search")) {
                shop.searchPC();
            } else if (s.equals("array")) {
                for (PC ps : shop.arrayPCs) {
                    System.out.println(ps);
                }
            } else if (s.equals("exit")) {
                break;
            }
        }
    }
}
