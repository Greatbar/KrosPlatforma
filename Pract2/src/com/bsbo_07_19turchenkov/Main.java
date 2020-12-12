package com.bsbo_07_19turchenkov;

import com.bsbo_07_19turchenkov.task1.*;
import com.bsbo_07_19turchenkov.task2.*;
import com.bsbo_07_19turchenkov.task3.*;
import com.bsbo_07_19turchenkov.task4.*;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean tasks = true;
        while (tasks) {

            Menu();
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> Task1();
                case 2 -> Task2();
                case 3 -> Task3();
                case 4 -> Task4();
                case 9 -> tasks = false;
            }
        }
    }

    public static void Task1() {
        cats tiger = new cats.Tigers("Тигр Сева");
        cats lion = new cats.Lions("Лев Лера");
        cats gepard = new cats.Gepards("Гепард Сева");
        tiger.show();
        lion.show();
        gepard.show();
    }

    public static void Task2() {
        Cats grandcat_dad = new Cats("Дедушка Всеволод", "", "");
        Cats grandcat_mom = new Cats("Бабушка Валерия", "", "");
        Cats cat_dad = new Cats("Папа Сева", "", grandcat_dad.getName());
        Cats cat_mom = new Cats("Мама Лера", grandcat_mom.getName(), "");
        Cats cat_daughter = new Cats("Дочка Лерочка", cat_mom.getName(), cat_dad.getName());
        Cats cat_son = new Cats("Сын Севочка", cat_mom.getName(), cat_dad.getName());
        grandcat_dad.show();
        grandcat_mom.show();
        cat_dad.show();
        cat_mom.show();
        cat_daughter.show();
        cat_son.show();
    }

    public static void Task3() {
        Cats_Task3.addcat();
    }
/*
    public static void Task4() {
        HashSet<Cats_Task4> cats_task4HashSet = Cats_Task4.createCats();
        Cats_Task4.printCats(cats_task4HashSet);
        cats_task4HashSet.remove(cats_task4HashSet.toArray()[0]);
        System.out.println();
        Cats_Task4.printCats(cats_task4HashSet);
    } */

    public static void Task4() {
        HashSet<Cat> CatHash = Cats_Task4.createCats();
        Cats_Task4.printCats(CatHash);
        CatHash.remove(CatHash.iterator().next());
        System.out.println("После удаления");
        Cats_Task4.printCats(CatHash);
    }
    private static void Menu() {
        System.out.print("\n1 - Задание 1: ");
        System.out.print("\n2 - Задание 2:");
        System.out.print("\n3 - Задание 3:");
        System.out.print("\n3 - Задание 4:");
        System.out.print("\n9 - Выход\n");
        System.out.print("Выберите что вы хотите сделать: ");

    }
}