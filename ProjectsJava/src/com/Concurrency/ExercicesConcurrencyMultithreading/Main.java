package com.Concurrency.ExercicesConcurrencyMultithreading;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch(TimeUnit.SECONDS);
        Thread green = new Thread(stopWatch::countDown, StopWatch.ThreadColor.ANSI_GREEN.name());
        Thread purple = new Thread(() -> stopWatch.countDown(7),
                StopWatch.ThreadColor.ANSI_PURPLE.name());
        Thread red = new Thread(stopWatch::countDown, StopWatch.ThreadColor.ANSI_RED.name());
        green.start();
        purple.start();
        red.start();
    }
}

