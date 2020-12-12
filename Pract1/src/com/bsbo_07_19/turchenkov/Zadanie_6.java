package com.bsbo_07_19.turchenkov;

public class Zadanie_6 {
    static void Fib() {

        int[] fib = new int[13];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < 13; ++i) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(i - 1 + ") " + fib[i - 1] + " \n");
        }
    }
}