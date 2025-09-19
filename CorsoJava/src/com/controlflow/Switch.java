package com.controlflow;

public class Switch {

    public static void main(String[] args) {


        int month = 4;


        switch (month) {

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("April");
                break;
            case 3:
                System.out.println("March");
                break;

            default:
                System.out.println("default");

                break;
        }
    }
}

