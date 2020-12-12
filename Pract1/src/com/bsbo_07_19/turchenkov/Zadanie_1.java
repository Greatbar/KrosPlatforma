package com.bsbo_07_19.turchenkov;

import java.util.Arrays;

public class Zadanie_1 {

    static void Random() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 100));
            System.out.println(arr[i]);
        }
        // Поиск минимального значения
        var min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        // Поиск максимального значения
        var max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        // Поиск среднего значения
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double av = sum / arr.length;
        System.out.println("Минимальное число " + min);
        System.out.println("Максимальное число " + max);
        System.out.println("Среднее значение " + av);
    }
}
