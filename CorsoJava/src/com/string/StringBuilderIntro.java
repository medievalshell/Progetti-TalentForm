package com.string;

public class StringBuilderIntro {

    public static void main(String[] args) {

        StringBuilder word = new StringBuilder("Hello");
        word.append("Java");
        System.out.println(word);

        StringBuilder color = new StringBuilder("Red");

        color.insert(1, "Orange");
        System.out.println(color);

        StringBuilder car = new StringBuilder("Audi");

        car.delete(1, 3);
        System.out.println(car);

        StringBuilder football = new StringBuilder("Football");

        football.reverse();

        System.out.println(football);

    }
}
