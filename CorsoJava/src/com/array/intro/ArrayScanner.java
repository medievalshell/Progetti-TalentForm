package com.array.intro;
import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);
        int[] numeri = new int[5];

        for (int i = 0; i < numeri.length; i++) {
            System.out.print("Inserisci un numero: ");
            numeri[i] = scanner.nextInt();
        }

        System.out.println("Numeri inseriti:");
        for (int num : numeri) {
            System.out.println(num);
        }


	}

}
