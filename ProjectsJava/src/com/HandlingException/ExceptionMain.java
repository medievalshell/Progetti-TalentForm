package com.HandlingException;


public class ExceptionMain {

    public static void main(String[] args) {



        // EXEPTION BY ZERO
        try {
            int arithmetic = 6 / 0;
        } catch (ArithmeticException e) {


            System.out.println("EXCEPTION GOOD");

        }



        // EXEPTION ARRAY INDEX OF
        try {

            int[] array = new int[5];

            array[0] = 10;
            array[1] = 20;
            array[2] = 30;
            array[3] = 40;
            array[4] = 50;

            System.out.println(array[5]);

        } catch (Exception e) {


            System.out.println(" ARRAY EXCEPTION GOOD");

        }


    }

}