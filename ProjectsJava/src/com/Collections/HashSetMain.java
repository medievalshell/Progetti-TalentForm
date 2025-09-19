package com.Collections;

import java.util.HashSet;


public class HashSetMain {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println("HashSet content: ");
        System.out.println(hs);
        String[] strArr = new String[hs.size()];
        hs.toArray(strArr);
        System.out.println("Copied array content:");
        for(String str:strArr){
            System.out.println(str);
        }
    }

}
