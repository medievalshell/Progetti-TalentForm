package com.oop.classes.intro;

public class Dipendente {

	private int stipendio;
	private int oreLavorate;
	private int retribuzioneOraria;
	// Costruttore
    public Dipendente(int stipendio, int oreLavorate, int retribuzioneOraria) {
        this.stipendio = stipendio;
        this.oreLavorate = oreLavorate;
        this.retribuzioneOraria = retribuzioneOraria;
    }

    // Getter e Setter
    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public int getOreLavorate() {
        return oreLavorate;
    }

    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }

    public int getRetribuzioneOraria() {
        return retribuzioneOraria;
    }

    public void setRetribuzioneOraria(int retribuzioneOraria) {
        this.retribuzioneOraria = retribuzioneOraria;
    }

    // Metodo per calcolare lo stipendio
    public int calcolaStipendio() {
        return oreLavorate * retribuzioneOraria;
    }

    @Override
    public String toString() {
        return "Dipendente {" +
                "stipendio base=" + stipendio +
                ", oreLavorate=" + oreLavorate +
                ", retribuzioneOraria=" + retribuzioneOraria +
                ", stipendio totale=" + calcolaStipendio() +
                '}';
    }

	public static void main(String[] args) {

	}

}
