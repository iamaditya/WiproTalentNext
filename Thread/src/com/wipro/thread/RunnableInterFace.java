package com.wipro.thread;

public class RunnableInterFace implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        RunnableInterFace runthread = new RunnableInterFace();
        Thread t1 = new Thread(runthread,"Aditya");

        t1.start();
        System.out.println("Thread Name : "+t1.getName());
    }

}
