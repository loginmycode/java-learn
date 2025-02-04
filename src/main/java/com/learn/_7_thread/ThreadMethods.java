package com.learn._7_thread;

public class ThreadMethods extends Thread {

    public void run()
    {
        System.out.println("run()"+ " "+getName());
    }

    public static void main(String[] args) {
        Thread t= new Thread();
        t.setName("t1");
        ThreadMethods t1 = new ThreadMethods();
        ThreadMethods t2 = new ThreadMethods();
        t1.start();
        t2.start();
        t2.setPriority(1);
    }







}
