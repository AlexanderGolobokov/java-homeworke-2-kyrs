package zadanie_2.prak_11;

import java.util.Date;
import java.util.Scanner;

public class Dates {
    public static Date deltaDate(Date date1, Date date2){
        int deltaYear = date1.getYear() - date2.getYear();
        int deltaMonth = date1.getMonth() - date2.getMonth();
        int deltaDate = date1.getDate() - date2.getDate();
        if (deltaDate < 0){
            deltaDate *= -1;
        }
        if (deltaMonth < 0){
            deltaMonth *= -1;
        }
        if (deltaDate < 0){
            deltaDate *= -1;
        }
        Date date = new Date(deltaYear, deltaMonth, deltaDate);
        return date;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your date:");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int date = scanner.nextInt();
        Date date1 = new Date(year, month, date);
        Date date2 = new Date();
        System.out.println(date2.getYear());
        Date date3 = deltaDate(date1, date2);
        System.out.println("delta between dates:\n" + date3.getYear());
    }
}
