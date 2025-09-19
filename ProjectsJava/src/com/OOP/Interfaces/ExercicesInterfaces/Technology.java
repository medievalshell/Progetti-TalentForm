package com.OOP.Interfaces.ExercicesInterfaces;

public sealed interface Technology permits MacBook, Asus {

    String getBrand();
}

final class MacBook implements Technology {

    @Override
    public String getBrand() {

        return "MacBook";
    }

    public static void main(String[] args) {

        Technology mc = new MacBook();
        Technology as = new Asus();
        System.out.println(mc.getBrand());
        System.out.println(as.getBrand());

    }
}

non-sealed class Asus implements Technology {

    @Override
    public String getBrand() {

        return "Asus";
    }
}