package com.ControlFlow.iterators;

public class For {


    public static void main(String[] args) {


        for (int i = 0; i < 20; i=i+2) {

            if (i == 6) {

                continue;

            }

            System.out.println(i);

        }


    }

}
