package com.oop.classes.intro;

import java.io.Serializable;

public abstract class Veicolo implements Serializable {
	private static final long serialVersionUID = 1L; 
    private String marca;
    private String modello;
    private String targa;
    private int velocitaMassima;
    private double prezzo;
    private boolean antifurtoAttivo;

    public Veicolo(String marca, String modello, String targa, int velocitaMassima, double prezzo, boolean antifurtoAttivo)  {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.velocitaMassima = velocitaMassima;
        this.prezzo = prezzo;
        this.antifurtoAttivo = antifurtoAttivo;
    }

    // Getter e Setter per tutte le proprietà
    public String getMarca() { return marca; }
    public String getModello() { return modello; }
    public String getTarga() { return targa; }
    public int getVelocitaMassima() { return velocitaMassima; }
    public double getPrezzo() { return prezzo; }
    public boolean isAntifurtoAttivo() { return antifurtoAttivo; }
    public void setAntifurtoAttivo(boolean antifurtoAttivo) { this.antifurtoAttivo = antifurtoAttivo; }

    // Metodo astratto per il tipo di veicolo
    public abstract String getTipoVeicolo();
}
