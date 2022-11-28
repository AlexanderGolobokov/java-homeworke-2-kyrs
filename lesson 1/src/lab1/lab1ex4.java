package ru.mirea.lab1;

import java.util.Scanner;
public class lab1ex4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        num = sc.nextInt();
        int [] a = new int[num];
        int i = 0;
        int max = 0, min = 999999999;

        while (i < num)
        {
            a[i] = sc.nextInt();

            if (a[i] > max)
            {
                max = a[i];
            }
            if (a[i] < min)
            {
                min = a[i];
            }

            sum += a[i];
            i++;
        }
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
    }
}
