package com.bsbo_07_19turchenkov;

import java.io.Serializable;

public class Cat extends Cats implements Serializable {
    public Cat CatMom;
    public Cat CatDad;

    public Cat(String breed, int age, String name, Cat catMom, Cat catDad) {
        super(breed, age, name);
        this.CatDad = catDad;
        this.CatMom = catMom;
    }

    public Cat(String breed, int age, String name) {
        this(breed, age, name, null, null);
    }

    public String checkParent(Cat parent) {
        if (parent != null) {
            return parent.name;
        } else {
            return "никто";
        }
    }

    public void showPedigree() {
        System.out.printf("Меня зовут %s, моя мама %s и мой папа %s \n", name, checkParent(CatMom), checkParent(CatDad));
    }
}