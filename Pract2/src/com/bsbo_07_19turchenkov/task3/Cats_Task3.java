package com.bsbo_07_19turchenkov.task3;

import com.bsbo_07_19turchenkov.task2.*;
import java.util.ArrayList;

public class Cats_Task3 {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public static void addcat() {
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat("Кот тазик - " + (i + 1)));
        }
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < 10; i++) {
            System.out.println(cats.get(i).name);
        }
    }
}