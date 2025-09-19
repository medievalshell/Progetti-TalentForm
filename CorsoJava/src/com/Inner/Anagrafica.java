package com.Inner;

public class Anagrafica {
	int telefono;
	String documentiIdentità;
	public class Utente{
		String nome;
		String cognome;
		public Utente(String nome, String cognome) {
			super();
			this.nome = nome;
			this.cognome = cognome;
		}
		public void utente() {
			System.out.println("TELEFONO: " + telefono + " DOCUMENTO: " + documentiIdentità + " NOME: " + nome + " COGNOME: " + cognome);
		}
	}
	public Anagrafica(int telefono, String documentiIdentità) {
		super();
		this.telefono = telefono;
		this.documentiIdentità = documentiIdentità;
	}
	public static void main(String[] args) {
		Anagrafica anagrafica = new Anagrafica(123456, "ABCDE");
		Anagrafica.Utente u = anagrafica.new Utente("Mario", "Rossi");
		u.utente();
	}
}