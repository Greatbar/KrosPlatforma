package com.bsbo_07_19turchenkov.task2;

public class Cats extends Cat {
    public String name_mom;
    public String name_dad;

    public Cats(String name, String name_mom, String name_dad) {
        super(name);
        this.name_mom = name_mom;
        this.name_dad = name_dad;
    }

    public void show() {
        super.show();
        System.out.println(name_mom);
        System.out.println(name_dad);
    }
}