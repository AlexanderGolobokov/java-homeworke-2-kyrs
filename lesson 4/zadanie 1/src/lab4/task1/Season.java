package lab4.task1;

import java.util.Scanner;

public class Season{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seazon seazon = Seazon.AUTUMN;
        Seazon seazon1 = null;
        String str;
        String str2 = Seazon.AUTUMN.getTitle();
        int k = 0;
        do {
            str = scanner.nextLine();
            switch (str) {
                case (Seazon.tittleWinter):
                    seazon1 = Seazon.WINTER;
                    k++;
                    break;
                case (Seazon.tittleSpring):
                    seazon1 = Seazon.SPRING;
                    k++;
                    break;
                case (Seazon.tittleSummer):
                    seazon1 = Seazon.SUMMER;
                    k++;
                    break;
                case (Seazon.tittleAutumn):
                    seazon1 = Seazon.AUTUMN;
                    k++;
                    break;
                default:
                    k = 0;
                    System.out.println("uncorrect season");
                    break;
            }
        }while (k == 0);
        for(Seazon i : Seazon.values()){
            System.out.println(i.abuotSeason());
        }
        System.out.println(seazon1.getTitle());
        System.out.println(seazon.abuotSeason());
        System.out.println(seazon.abuotSeason());
        seazon.getDecription();
    }
}