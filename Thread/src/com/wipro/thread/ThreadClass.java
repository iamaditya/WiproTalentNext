package com.wipro.thread;

public class ThreadClass extends Thread{

    @Override
    public void run(){
        System.out.println("Hey");
    }

    public static void main(String[] args) {
        ThreadClass t1= new ThreadClass();
        t1.start();
        System.out.println("Aditya Sharma");
    }
}
