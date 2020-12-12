package com.bsbo_07_19.turchenkov;

import java.util.Scanner;

public class Zadanie_3 {

    static void Binary() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int binary = in.nextInt();
        if (binary > 1) {
            if ((binary & -binary) == binary) {
                System.out.println("Число бинарное\n");
            }
            else System.out.print("Число небинарное\n");
        }
    }
}
