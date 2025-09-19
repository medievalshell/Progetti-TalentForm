package com.array;

import java.util.Scanner;

public class NewArray {

	public static void main(String[] args) {

		
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Inserisci un numero: ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Indice da rimuovere (0-4): ");
        int pos = scanner.nextInt();

        if (pos < 0 || pos >= arr.length) {
            System.out.println("Posizione non valida!");
        } else {
            int[] nuovo = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != pos) {
                    nuovo[j++] = arr[i];
                }
            }

            System.out.println("Array dopo la rimozione:");
            for (int num : nuovo) {
                System.out.println(num);
            }
        }

		
		

	}

}
