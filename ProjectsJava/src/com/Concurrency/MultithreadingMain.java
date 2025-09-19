package com.Concurrency;

public class MultithreadingMain extends Thread {

    public void run() {

        try {
            for (int i = 1; i < 10; i++) {
                System.out.println(MultithreadingMain.class.getSimpleName() + i);
                Thread.sleep(3000);

            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        MultithreadingMain t1 = new MultithreadingMain();
        MultithreadingMain t2 = new MultithreadingMain();
        MultithreadingMain t3 = new MultithreadingMain();
        MultithreadingMain t4 = new MultithreadingMain();
        MultithreadingMain t5 = new MultithreadingMain();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t4.setName("Thread 4");
        t5.setName("Thread 5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}