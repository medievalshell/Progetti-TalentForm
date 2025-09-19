package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {


    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.remove(0);


        for (int names : numbers) {

            System.out.println(names);
        }

        List<String> names = new ArrayList<String>();


        names.add("anna");
        names.add("marco");
        names.add("antonio");

        names.set(1, "luca");


        Collections.sort(names);

        for (String students : names) {


            System.out.println(students);


        }

        Collections.sort(names);

        System.out.println(names);


    }


}