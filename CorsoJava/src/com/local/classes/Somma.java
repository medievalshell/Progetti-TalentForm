package com.local.classes;

public class Somma {
    public static void somma(int a, int b) {
        class Adder {
            int add(int x, int y) {
                return x + y;
            }
        }
        Adder adder = new Adder();
        System.out.println("Somma: " + adder.add(a, b));
    }
    public static void main(String[] args) {
        somma(5, 7);
    }
}
