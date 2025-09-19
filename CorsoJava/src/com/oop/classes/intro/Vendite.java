package com.oop.classes.intro;

public class Vendite {

	public static void main(String[] args) {
		
		Camiceria camiceria = new Camiceria("M","Bianco",40,"Estate",100,true);
		
	
		
		System.out.println(camiceria.getColore());
		System.out.println(camiceria.getTaglia());
		System.out.println(camiceria.getPrezzo());
		System.out.println(camiceria.getStagione());
		System.out.println(camiceria.getQuantità());
		
	    GestioneMagazzino magazzino = new GestioneMagazzino("M","Bianco",40,"Estate",100,true);
	        

	      magazzino.taglia();
	      magazzino.colore();
	      magazzino.prezzo();
	      magazzino.tipologia(false);

	}

}
