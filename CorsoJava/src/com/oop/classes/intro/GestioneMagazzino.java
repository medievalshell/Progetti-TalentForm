package com.oop.classes.intro;

public class GestioneMagazzino extends Camiceria {

	public GestioneMagazzino(String taglia, String colore, int prezzo, String stagione, int quantità,
			boolean tipologia) {
		super(taglia, colore, prezzo, stagione, quantità, tipologia);
		
	}

	public void taglia() {

		System.out.println("MAGAZZINO TAGLIA :" + getTaglia());
	}

	public void colore() {

		System.out.println("MAGAZZINO COLORE:" + getColore());
	}

	public void prezzo() {

		System.out.println("MAGAZZINO PREZZO :" + getPrezzo());
	}

	public void tipologia(boolean tipologia) {

		if (tipologia == true) {

			System.out.println("UOMO");

		}

		else {
			System.out.println("DONNA");

		}

	}

}
