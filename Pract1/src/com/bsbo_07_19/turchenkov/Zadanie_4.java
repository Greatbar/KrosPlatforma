package com.bsbo_07_19.turchenkov;

import java.util.Scanner;

public class Zadanie_4 {

    static void Factorial() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i ++){
            result = result*i;
        }
        System.out.println(result);
    }
}
