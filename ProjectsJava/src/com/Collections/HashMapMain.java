package com.Collections;

import java.util.HashMap;

public class HashMapMain {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        System.out.println("Size of map is:- "
                + map.size());

        System.out.println(map);

        if (map.containsKey("vishal")) {

            // Mapping
            Integer a = map.get("vishal");

            // Printing value for the corresponding key
            System.out.println("value for key"
                    + " \"vishal\" is:- " + a);

        }

    }


}
