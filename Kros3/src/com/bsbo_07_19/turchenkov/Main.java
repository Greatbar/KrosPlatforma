package com.bsbo_07_19.turchenkov;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        boolean tasks = true;
        while (tasks) {

            Menu();
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> Tasks.zadanie1();
                case 2 -> Tasks.zadanie2();
                case 3 -> Tasks.zadanie3();
                case 4 -> Tasks.zadanie4();
                case 5 -> Tasks.zadanie5();
                case 6 -> Tasks.zadanie6();
                case 7 -> Tasks.zadanie7();
                case 8 -> Tasks.zadanie8();
                case 9 -> tasks = false;
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
        System.out.print("\n7 - Задание 7:");
        System.out.print("\n8 - Задание 8:");
        System.out.print("\n9 - Выход\n");
        System.out.print("Выберите что вы хотите сделать: ");
    }
}
