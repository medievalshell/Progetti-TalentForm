package com.Inner;

public class Ordine {
    private String cliente;

    public Ordine(String cliente) {
        this.cliente = cliente;
    }

    class Prodotto {
        private String nome;
        private double prezzo;

        public Prodotto(String nome, double prezzo) {
            this.nome = nome;
            this.prezzo = prezzo;
        }

        public void stampaDettagli() {

            System.out.println("Cliente: " + cliente + " | Prodotto: " + nome + " | Prezzo: " + prezzo + "€");
        }
    }

    public static void main(String[] args) {

        Ordine ordine = new Ordine("Mario Rossi");

        Ordine.Prodotto prodotto = ordine.new Prodotto("Laptop", 1200.50);

        prodotto.stampaDettagli();
    }

}
