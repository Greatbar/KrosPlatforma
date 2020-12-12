package com.bsbo_07_19.turchenkov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean tasks = true;

        while (tasks) {

            Menu();
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> Zadanie_1.Random();
                case 2 -> Zadanie_2.Season();
                case 3 -> Zadanie_3.Binary();
                case 4 -> Zadanie_4.Factorial();
                case 5 -> Zadanie_5.Year();
                case 6 -> Zadanie_6.Fib();
                case 7 -> tasks = false;
            }
        }
    }
    private static void Menu()
    {
        System.out.print("\n1 - Задание 1: ");
        System.out.print("\n2 - Задание 2:");
        System.out.print("\n3 - Задание 3:");
        System.out.print("\n4 - Задание 4:");
        System.out.print("\n5 - Задание 5:");
        System.out.print("\n6 - Задание 6:");
        System.out.print("\n7 - Выход\n");
        System.out.print("Выберите что вы хотите сделать: ");
    }
}