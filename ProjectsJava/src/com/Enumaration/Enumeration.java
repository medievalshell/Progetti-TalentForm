package com.Enumaration;


public class Enumeration {
    enum Level {
        MEDIUM,
        HIGH

    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        Level myV = Level.HIGH;
        System.out.println(myVar);
        System.out.println(myV);
    }
}

