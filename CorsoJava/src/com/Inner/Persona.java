package com.Inner;

public class Persona {
    String nome = "Luca";

     class Indirizzo {
         String citta = "Roma";
         void stampa(){
             System.out.println(nome + " vive a " + citta);
         }
     }

     public static void main(String[] args){
         Persona p = new Persona();
         Persona.Indirizzo i = p.new Indirizzo();
         i.stampa();
     }

}