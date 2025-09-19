package com.oop.classes.intro;

public class Moto extends Veicolo {
    public Moto(String marca, String modello, String targa, int velocitaMassima, double prezzo, boolean antifurtoAttivo) {
        super(marca, modello, targa, velocitaMassima, prezzo, antifurtoAttivo);
    }
    @Override
    public String getTipoVeicolo() {
        return "Moto";
    }
}