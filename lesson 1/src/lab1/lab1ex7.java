package ru.mirea.lab1;

import java.util.Scanner;
public class lab1ex7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println(sum(y));
    }

    public static float sum (int a)
    {
        Scanner sc = new Scanner(System.in);

        int fact = 1;

        for(int i = 1; i <= a; i++)
        {
            fact *= i;
        }

        return fact;
    }
}