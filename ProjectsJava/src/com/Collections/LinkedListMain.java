package com.Collections;

import java.util.LinkedList;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();
        cars.offer("Volvo");
        cars.offer("BMW");
        cars.offerLast("Mazda");
        cars.offerFirst("Ford");
        cars.push("Fiat");
        cars.push("Audi");
        cars.removeLast();
        cars.removeFirst();
        System.out.println(cars);


    }

}
