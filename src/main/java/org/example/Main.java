package org.example;

import java.io.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Main extends Thread {
private final ReentrantLock tempLock = new ReentrantLock();

    private final ReentrantLock tempLock2 = new ReentrantLock();




// NEW, Runnable
static int val = 0;
    @Override
    public void run() {
       val++;
        System.out.println("ThreadID: " + Thread.currentThread().getId());

    }


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Main thread = new Main();
            thread.start();


            while(thread.isAlive()) {
                System.out.println("WAITING for THREAD DEATH");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("val: " + val);
            val++;

            System.out.println("val: " + val);
        }








    }

}
