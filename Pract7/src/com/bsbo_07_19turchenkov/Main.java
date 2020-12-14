package com.bsbo_07_19turchenkov;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Zadanie_1_CatSerializer.Task1();
        Zadanie_2_HeavyBox.Task2();
        Zadanie_3_MetaInfo.printInfo(HeavyBox.class);
        Zadanie6_lambda();
    }

    public static void Zadanie6_lambda() {
        final Supplier<Integer> elementGetter = () -> ((int) (0 + Math.random() * 10));
        System.out.println("Рандомное число от 1 до 10: " + elementGetter.get());
    }
}