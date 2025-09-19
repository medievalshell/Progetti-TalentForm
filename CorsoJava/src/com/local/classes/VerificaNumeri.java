//Verifica numero pari o dispari Esercizio: All’interno di un metodo usa una classe locale per determinare se un numero è pari o dispari.
package com.local.classes;
import java.util.Scanner;

public class VerificaNumeri {
	public static void controllo(int numero){
		class PoD{
			boolean numero() {
				return (numero % 2 == 0);
			}
		}
		PoD n = new PoD();
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println(numero + (n.numero() ? " è pari" : " è dispari"));
		System.out.println("----------------------------------------------------------------------------------------------------------");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.print("Inserisci un numero intero: ");
		int numeroUtente = scanner.nextInt();
		controllo(numeroUtente);
		scanner.close();
	}
}
