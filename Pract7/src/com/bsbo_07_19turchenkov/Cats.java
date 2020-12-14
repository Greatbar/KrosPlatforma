package com.bsbo_07_19turchenkov;

import java.io.Serializable;

public class Cats implements Serializable {
    public String breed;
    public int age;
    public String name;

    public Cats(String breed, int age, String name) {
        this.breed = breed;
        this.age = age;
        this.name = name;
    }
}