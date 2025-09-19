package com.oop.classes.intro;

import java.io.Serializable;

public class Auto extends Veicolo implements Serializable {
	private static final long serialVersionUID = 1L;
    public Auto(String marca, String modello, String targa, int velocitaMassima, double prezzo, boolean antifurtoAttivo) {
        super(marca, modello, targa, velocitaMassima, prezzo, antifurtoAttivo);
    }
    @Override
    public String getTipoVeicolo() {
        return "Auto";
    }
}
