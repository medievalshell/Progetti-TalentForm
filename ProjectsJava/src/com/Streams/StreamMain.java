package com.Streams;

import java.util.*;
import java.util.stream.*;


public class StreamMain {

    public static void main(String[] args) {


        //Esegui un'azione su ciascun elemento dello stream

        List<Integer> flow = Arrays.asList(1, 2, 3, 4, 5);
        flow
                .forEach(num -> System.out.print(num + " "));


        //Restituisce il numero di elementi nello stream count
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        long count = names.size();

        System.out.println(count);


        //Rimuove gli elementi duplicati dallo stream:
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
        var distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);

        //Raccoglie gli elementi dello stream in una collezione o in un'altra struttura dati definita dal Collector

        List<String> words = Arrays.asList("Hello", "Stream", "API");
        var concatenated = String.join(" ", words);
        System.out.println(concatenated);


    }
}
