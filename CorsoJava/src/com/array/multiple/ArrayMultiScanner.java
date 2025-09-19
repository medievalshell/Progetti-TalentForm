package com.array.multiple;
import java.util.Scanner;

public class ArrayMultiScanner {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        int[][] matrice = new int[2][2];

        System.out.println("Inserisci i valori della matrice 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrice[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrice inserita:");
        for (int[] riga : matrice) {
            for (int val : riga) {
                System.out.print(val + " ");
            }
            System.out.println();
        }


	}

}
