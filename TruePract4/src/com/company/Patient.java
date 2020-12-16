package com.company;

public  class Patient {
    //public Process patientservice;

    public static volatile boolean hasservicedT;
    public static volatile boolean hasservicedMRT;
    public static volatile int ID;
    // volatile Process therapist;
    // volatile Process mrt;


    //public Process.ServiceCategory patientstep;

    public String otzyv1;

    public void suck() {

        //therapist();
        // mrt.mrt(this);
        if (hasservicedT && hasservicedMRT) System.out.println(ID + " good serv");
        else System.out.println(ID + " bad serv");
    }

    public Patient(int ID, boolean hasservicedT, boolean hasservicedMRT) throws InterruptedException {
        Thread.sleep(1000);
    }

    public boolean teraped() {
        return hasservicedT;
    }

    public boolean mrted() {
        return hasservicedMRT;
    }
}