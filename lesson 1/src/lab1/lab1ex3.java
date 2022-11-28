package ru.mirea.lab1;

import java.util.Scanner;
public class lab1ex3
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    int num = 0;
    num = sc.nextInt();
    int [] a = new int[num];
    float sum = 0;
    for (int i = 0; i < num; i++)
    {
        a[i] = sc.nextInt();
        sum += a[i];
    }
    System.out.println(sum);
    System.out.println(sum/num);
}
}
