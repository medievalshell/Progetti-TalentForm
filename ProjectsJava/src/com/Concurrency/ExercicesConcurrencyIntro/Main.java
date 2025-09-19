package com.Concurrency.ExercicesConcurrencyIntro;

public class Main {

    public static void main(String[] args) {

        var currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());

        System.out.println(currentThread);
        printThreadState(currentThread);

        currentThread.setName("MainGuy");
        currentThread.setPriority(Thread.MAX_PRIORITY);
        printThreadState(currentThread);
    }

    public static void printThreadState(Thread thread) {

        System.out.println("----------------------");
        System.out.println("Thread ID: " + thread.getId());
        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread Priority: " + thread.getPriority());
        System.out.println("Thread State: " + thread.getState());
        System.out.println("Thread Group: " + thread.getThreadGroup());
        System.out.println("Thread Is Alive: " + thread.isAlive());
        System.out.println("----------------------");
    }

    public class CustomThread extends Thread {

        @Override
        public void run() {

            for (int i = 1; i <= 5; i++) {
                System.out.print(" 1 ");
                try {
                    Thread.sleep(500);  // Adding a 1-second delay between each count
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
