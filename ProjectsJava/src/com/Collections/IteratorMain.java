package com.Collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class IteratorMain {

    public static void main(String[] args) {


        List<String> names = new ArrayList<String>();

        names.add("luca");
        names.add("paolo");
        names.add("marco");
        names.add("anna");
        names.remove("luca");


        Iterator<String> it = names.iterator();


        while (it.hasNext()) {

            String students = it.next();

            System.out.println(students);


        }
    }
}



