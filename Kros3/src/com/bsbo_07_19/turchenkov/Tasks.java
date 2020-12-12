package com.bsbo_07_19.turchenkov;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class Tasks {
    public static void zadanie1() {
        String name = "Иванов";
        String fam = "Иван";
        String otch = "Иванович";
        String FullStr = new String(name + " " + fam + " " + otch);
        System.out.println(FullStr);
        System.out.println(name.concat(fam).concat(otch));
    }

    public static void zadanie2() {
        String name = "Петя";
        int age = 27;
        String text;
        text = String.format("Меня зовут " + name + " и мне " + age);
        System.out.println(text);
    }

    public static void zadanie3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        char[] word = str.toCharArray();
        for (char c : word) {
            System.out.print(" " + c);
        }
    }

    public static void zadanie4() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String Str = in.nextLine();

        System.out.print("Введите символ который заменить: ");
        String Letter_1 = in.nextLine();
        System.out.print("Введите на какой символ заменить: ");
        String Letter_2 = in.nextLine();
        System.out.print("Измененная строка с символов: ");
        System.out.println(Str.replace(Letter_1, Letter_2));

        System.out.print("Введите какое слово надо заменить: ");
        String word_1 = in.nextLine();
        System.out.print("Введите на какое слово заменить: ");
        String word_2 = in.nextLine();
        System.out.println(Str.replace(word_1, word_2));
        System.out.print("Измененная строка со словом: ");
        System.out.println(Str.replace(word_1, word_2));
    }

    public static void zadanie5() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str_1 = in.nextLine();
        String strUpper = str_1.toUpperCase();
        System.out.println("Изначальная строка: " + str_1);
        System.out.println("Верхний регистр: " + strUpper);
        System.out.print("Введите строку для сравнения: ");
        String str_2 = in.nextLine();
        if (str_1.equals(str_2)) {
            System.out.println("Строка: (" + str_1 + ") Равна строке: (" + str_2 + ")");
        } else
            System.out.println("Строка: (" + str_1 + ") Не равна строке: (" + str_2 + ")");
    }

    public static void zadanie6() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nСтрока до реверса: " + str);
        System.out.println("Строка в обратном порядке, после реверса: " + reverse);
    }

    public static void zadanie7() throws Exception {
        List<Integer> list = null;
        try {
            System.out.println("Введите числа:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            list = new LinkedList<>();
            while (true) {
                list.add(Integer.valueOf(reader.readLine()));
            }
        } catch (Exception e) {
            assert list != null;
            for (Integer integer : list) {
                System.out.println("Все введенные ранне числа: " + integer);
            }
        }
    }

    public static void zadanie8() throws Exception {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        try {
            int[] m1 = new int[2];
            m1[8] = 5;
        } catch (IndexOutOfBoundsException exceptionObject) {
            System.out.println(exceptionObject);
            //Напишите тут ваш кодArrayIndexOutOfBoundsException
        }
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s1 = list.get(18);
        } catch (Exception exceptionObject) {
            System.out.println(exceptionObject);
        }
    }
}
