package com.bsbo_07_19.turchenkov;

import java.util.Scanner;

public class Zadanie_2 {

    static void Season() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        int month = in.nextInt();
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "Такого месяца не существует";
        }
        System.out.println("Это " + season);
    }
}
