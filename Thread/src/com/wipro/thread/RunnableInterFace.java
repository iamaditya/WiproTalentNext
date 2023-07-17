package com.wipro.thread;

public class RunnableInterFace implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        RunnableInterFace runthread = new RunnableInterFace();
        Thread t1 = new Thread(runthread,"Aditya");
        Thread t2 = new Thread(runthread,"second");
        Thread t3 = new Thread(runthread,"third");
        Thread t4 = new Thread(runthread,"fourth");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("Thread Name : "+t1.getName());
        System.out.println("Thread Name : "+t2.getName());
        System.out.println("Thread Name : "+t3.getName());
        System.out.println("Thread Name : "+t4.getName());
    }

}
