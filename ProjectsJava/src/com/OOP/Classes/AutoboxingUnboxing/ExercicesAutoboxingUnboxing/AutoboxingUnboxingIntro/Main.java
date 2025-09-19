package com.OOP.Classes.AutoboxingUnboxing.ExercicesAutoboxingUnboxing.AutoboxingUnboxingIntro;

public class Main {

    public static void main(String[] args) {


        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

    }

    private static Double getDoubleObject() {

        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {

        return 100.0;
    }
}
