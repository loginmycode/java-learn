package com.learn._7_thread;

import javax.xml.transform.stream.StreamSource;

public class CreateThread extends Thread {

    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        CreateThread t1 = new CreateThread();
        t1.start();


    }
}
