package com.Concurrency;

public class ThreadMain extends Thread {

    public void run() {

        for (int i = 0; i < 6; i++) {
            System.out.println(ThreadMain.class.getSimpleName() + i);

        }
    }

    /* creazione ed esecuzione del thread */
    public static void main(String[] args) {
        ThreadMain t1 = new ThreadMain();
        t1.start();
    }
}