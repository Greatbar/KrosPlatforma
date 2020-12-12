package com.bsbo_07_19turchenkov.task2;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void show() {
        System.out.println(name);
    }
}