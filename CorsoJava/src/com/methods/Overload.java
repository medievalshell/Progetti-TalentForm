package com.methods;

public class Overload {

    final static int Cod = 123245;


    public int calc(int a, int b) {

        return a + b;
    }

    public double calc(double c, double d) {
        return c - d;


    }

    public static void main(String[] args) {

        Overload overload = new Overload();

        int a = 56;
        int b = 36;
        double c = 56.67;
        double d = 36.45;

        System.out.println(overload.calc(a, b));
        System.out.println(overload.calc(c, d));


    }


}
