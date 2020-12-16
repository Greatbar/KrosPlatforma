package com.company;

import java.util.*;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class practica4 {

    public static void task1() {
        Thread myThready = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                int r = i % 10;
                if (r == 0) {
                    System.out.println(i);
                }
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println("Побочный поток!");
        });
        myThready.start();
        //System.out.println("Главный поток завершён");
    }

    static Scanner in = new Scanner(System.in);
    static Integer s;

    public static void task3() {
        System.out.println("enter the size of elements");
        s = in.nextInt();
        Vector<Integer> vector = new Vector(s);
        for (int i = 0; i < vector.capacity(); i++) {
            vector.add(i, 0);
            System.out.println(vector + "to position" + i);
        }
        int a = 1;
        int b = 100;
        Thread write = new Thread(() -> {
            System.out.println("поток заполнения");
            for (int i = 0; i < s; i++) {
                Integer r = a + (int) (Math.random() * b);
                vector.set(i, r);
                System.out.println("Write: " + r + " to position " + i);
            }
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        write.start();

        Thread read = new Thread(() -> {
            System.out.println("поток чтения");
            for (int i = 0; i < s; i++) {
                System.out.println("Read: " + vector.get(i) + " from position " + i);
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        read.start();
        read.interrupt();
        write.interrupt();
    }

    public static void task4() {
        System.out.println("enter the num of work's threads ");
        s = in.nextInt();
        System.out.println("enter the length for massiv");
        int s1 = in.nextInt();
        int[] massivShella = new int[s1];
        Thread mainThread = new Thread(() -> {
            System.out.println("main поток");
            System.out.println("enter the nums for massiv");
            for (int i = 0; i < s1; i++) {
                //massivShella[i] = in.nextInt();}
                massivShella[i] = (int) (Math.random() * 100);
                System.out.print(massivShella[i] + " ");
            }

        });
        mainThread.start();
        List<Thread> ThreadList = new ArrayList<>();

        for (int i = 0; i < s; i++) {
            ThreadList.add(new Thread("Thread #" + i) {
                @Override
                public void run() {
                    int step = s1 / 2;
                    System.out.println(getName() + " was activated");
                    try {
                        Thread.sleep(10000);
                        while (step > 0) {
                            for (int i = 0; i < (s1 - step); i++) {
                                int j = i;
                                while (massivShella[j] > massivShella[j + step]) {
                                    int temp = massivShella[j];
                                    massivShella[j] = massivShella[j + step];
                                    massivShella[j + step] = temp;
                                    j--;
                                }
                            }
                            step = step / 2;
                        }
                    } catch (Exception ignored) {
                    }
                }
            });
        }
        System.out.println("Threads in list: ");
        for (Thread currentThread : ThreadList) {
            currentThread.start();
        }
// Выводим отсортированный массив
        for (int i = 0; i < s1; i++) {
            System.out.print(massivShella[i] + " ");
        }
    }
}