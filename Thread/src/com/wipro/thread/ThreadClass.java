package com.wipro.thread;

public class ThreadClass extends Thread{

    @Override
    public void run(){
        System.out.println(currentThread().getName());
        currentThread().setName("Aditya");
        for (int i=0;i<10;i++){
                if(i == 6){
                try{
                Thread.sleep(5000);
                    System.out.println(i);
            }catch(Exception e){}
        }else{
                    System.out.println(i);}
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
