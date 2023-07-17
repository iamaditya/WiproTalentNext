package com.wipro.thread;

public class ThreadClass extends Thread{

    @Override
    public void run(){
        System.out.println(currentThread().getName());
        currentThread().setName("Aditya");
        for (int i=0;i<5;i++){
            try{
                Thread.sleep(500);
                System.out.println("Hi"+ i);

            }catch(Exception e){}
        }
        System.out.println(currentThread().getName());

    }

    public static void main(String[] args) {
        ThreadClass t1= new ThreadClass();
        t1.start();
        System.out.println("Aditya Sharma");

//        print name of thread
        System.out.println(currentThread().getName());
        System.out.println(t1);
    }
}
