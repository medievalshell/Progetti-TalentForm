package com.local.classes;

public class AreaRettangolo {
    public static void calcolaArea(int base, int altezza) {
        class Rettangolo {
            int area() {
                return base * altezza;
            }
        }
        Rettangolo r = new Rettangolo();
        System.out.println("Area: " + r.area());
    }
    public static void main(String[] args) {
        calcolaArea(4, 6);
    }
}
