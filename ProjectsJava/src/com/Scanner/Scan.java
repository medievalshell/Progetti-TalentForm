package com.Scanner;

import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert name:");
        String name = sc.nextLine();
        System.out.println("Insert surname");
        String surname = sc.nextLine();
        System.out.println("Insert city");
        String city = sc.nextLine();
        System.out.println("Insert nation");
        String nationality = sc.nextLine();

        int age = sc.nextInt();
        System.out.println(age);


        sc.close();

    }

}


