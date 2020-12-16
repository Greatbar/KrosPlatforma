package com.company;

import java.util.Random;

public class Process extends Thread {
    Random random = new Random();
    boolean isBusy = false;
    private boolean flag;

    private int time;

    public volatile Patient service;

    public void therapist(Patient patient) {
        Thread doctor = new Thread(() -> {
            if (MyQueue.maxLength != 0) {
                if (!isBusy) {
                    System.out.println("Patient " + MyQueue.queue.element() + " go to therapist");
                    service = patient;
                    isBusy = true;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Patient.hasservicedT = true;
                    //MyQueue.queue.poll();
                    System.out.println("Patient " + MyQueue.queue.element() + " out of the therapist");
                    isBusy = false;
                } else {
                    System.out.println("Therapist is busy by patient " + Patient.ID);
                    Patient.hasservicedT = false;
                }
            }
        });
        doctor.start();
    }

    public void mrt(Patient patient) {
        Thread mrtt = new Thread(() -> {
            if (MyQueue.maxLength != 0) {
                if (!isBusy) {
                    System.out.println("Patient " + MyQueue.queue.element() + " go to MRT");
                    service = patient;
                    isBusy = true;
                    try {
                        Thread.sleep(1000);
                        //Thread.sleep(random.nextInt(1000)+100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Patient.hasservicedMRT = true;
                    System.out.println("Patient " + MyQueue.queue.element() + " out of the MRT");


                    isBusy = false;
                } else {
                    System.out.println("MRT is busy by patient " + Patient.ID);
                    Patient.hasservicedMRT = false;
                }
            }
        });
        mrtt.start();
    }

    public int generateRandomNumber(int min, int max) {
        int number = (int) (min + Math.random() * (max - min + 1)) * 10;
        return number;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public void run() {
        therapist(MyQueue.queue.peekFirst());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mrt(MyQueue.queue.peekFirst());
        try {
            Thread.sleep(5000);
            if (Patient.hasservicedT && Patient.hasservicedMRT) System.out.println(" good serv");
            else System.out.println(" bad serv");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isFlag() {
        return flag;
    }

    public void operating(MyQueue queue) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}