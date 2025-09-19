package com.oop.classes.intro;

public class Camiceria {

	private String taglia;
	private String colore;
	private int prezzo;
	private String stagione;
	private int quantità;
	private boolean tipologia;
	
	
	
	
	public Camiceria(String taglia, String colore, int prezzo, String stagione, int quantità, boolean tipologia) {

		this.taglia = taglia;
		this.colore = colore;
		this.prezzo = prezzo;
		this.stagione = stagione;
		this.quantità = quantità;
		this.tipologia = tipologia;
	}

	public String getTaglia() {
		return taglia;
	}

	public String getColore() {
		return colore;
	}

	public String getStagione() {
		return stagione;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public int getQuantità() {
		return quantità;
	}

	
}
