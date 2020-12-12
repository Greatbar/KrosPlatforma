package com.bsbo_07_19turchenkov.task4;

import com.bsbo_07_19turchenkov.task2.Cat;

import java.util.HashSet;
import java.util.Set;
/*
public class Cats_Task4 {
    public static HashSet<Cats_Task4> createCats() {
        HashSet<Cats_Task4> Cats = new HashSet<Cats_Task4>();
        for (int i = 0; i <= 2; i++) {
            Cats.add(new Cats_Task4());
        }
        return Cats;
    }

    public static void printCats(Set<Cats_Task4> Cats) {
        for (Cats_Task4 cat : Cats) {
            System.out.println(cat);
        }
    }
}

 */
public class Cats_Task4 {
    public static HashSet<Cat> createCats() {
        HashSet<Cat> Cats = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            Cats.add(new Cat("Мурзик - " + (i + 1)));
        }
        return Cats;
    }

    public static void printCats(Set<Cat> Cats) {
        for (Cat cat : Cats) {
            System.out.println(cat.name);
        }
    }
}