package com.bsbo_07_19.turchenkov;

import java.util.Scanner;

public class Zadanie_5 {

    static void Year() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int n2 = n;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        while (a == b || a == c || a==d || b == c || b == d || c == d || n == n2) {
            n2++;
            a = n2 % 10;
            b = (n2 / 10) % 10;
            c = (n2 / 100) % 10;
            d = (n2 /1000) % 10;
        }
        System.out.print(n2);
    }
}
