package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rand = new Random();

    public static void zadanie1_1() {
        practica4.task1();
    }

    public static void zadanie1_2() {
        StringBuilder sb = new StringBuilder().append('a');
        ArrayList<PrintChar_> printChar = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            printChar.add(new PrintChar_(sb));
        }
        printChar.forEach(PrintChar_::start);
    }

    public static void zadanie1_3() {
        practica4.task3();
    }

    public static void zadanie1_4() {
        practica4.task4();
    }

    public static void zadanie2_1() throws InterruptedException {
        ArrayList<Window> windows = new ArrayList<>();
        windows.add(new Window(1, Window.ServiceCategory.ALL));
        windows.add(new Window(2, Window.ServiceCategory.OLD));
        windows.add(new Window(3, Window.ServiceCategory.BUSINESS));
        ArrayList<Citizen> citizens = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            citizens.add(new Citizen(rand.nextInt(500) + 1,
                    Window.ServiceCategory.values()[rand.nextInt(3)],
                    windows.get(rand.nextInt(3))));
            citizens.get(i).start();
            Thread.sleep(500);
        }
        for (Citizen citizen : citizens) {
            citizen.join();
        }
        int YoungLeave, OldLeave, BusinessLeave;
        YoungLeave = citizens.stream().filter(
                citizen -> citizen.citizenCategory == Window.ServiceCategory.YOUNG
        ).findFirst().get().citizenCategory.leaving;
        OldLeave = citizens.stream().filter(
                citizen -> citizen.citizenCategory == Window.ServiceCategory.OLD
        ).findFirst().get().citizenCategory.leaving;
        BusinessLeave = citizens.stream().filter(
                citizen -> citizen.citizenCategory == Window.ServiceCategory.BUSINESS
        ).findFirst().get().citizenCategory.leaving;
        System.out.println("Count of leaving: " +
                "\t Young: " + YoungLeave +
                "\t Old: " + OldLeave +
                "\t Business: " + BusinessLeave);
    }

    public static void zadanie2_2() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int max;
        System.out.println("Enter the length of queue");
        max = in.nextInt();
        MyQueue.maxLength = max;

        Process process = new Process();
        for (int i = 0; i < MyQueue.maxLength; i++) {
            MyQueue.queue.addLast(new Patient(rand.nextInt((10000) + 10), false, false));
            System.out.println(" Size of queue " + MyQueue.queue.size());
        }
        while (MyQueue.queue.peek() != null) {
            process.start();
            System.out.println(MyQueue.queue.element() + " obslyjen");
            MyQueue.queue.removeFirst();
            System.out.println(" Size of queue " + MyQueue.queue.size());
        }

    }

    private static void Menu() {
        System.out.print("\n1 - Задание 1_1: ");
        System.out.print("\n2 - Задание 1_2: ");
        System.out.print("\n3 - Задание 1_3: ");
        System.out.print("\n4 - Задание 1_4: ");
        System.out.print("\n5 - Задание 2_1: ");
        System.out.print("\n6 - Задание 2_2: ");
        System.out.print("\n7 - Выход\n");
        System.out.print("Выберите что вы хотите сделать: ");
    }

    public static void main(String[] args) throws InterruptedException {
        boolean tasks = true;
        while (tasks) {
            Menu();
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> zadanie1_1();
                case 2 -> zadanie1_2();
                case 3 -> zadanie1_3();
                case 4 -> zadanie1_4();
                case 5 -> zadanie2_1();
                case 6 -> zadanie2_2();
                case 7 -> tasks = false;
            }
        }
    }
}