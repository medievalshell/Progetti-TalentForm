package com.LambdaExpression;

public class LambdaExpressionMain {

    public static void main(String[] args) {

        FormaGeometrica Rettangolo = (lato1,lato2) -> lato1 * lato2;
        System.out.println(Rettangolo.calcolaArea(3, 4));


        FormaGeometrica Quadrato = (lato1,lato2) -> lato1 * lato2;
        System.out.println(Quadrato.calcolaArea(3, 3));

        StampaMaiuscolo Stampa = testo -> testo.toUpperCase();
        System.out.println(Stampa.stampa("lambda"));

    }

    @FunctionalInterface
    public interface FormaGeometrica {
         double calcolaArea(double lato1, double lato2);
    }

    @FunctionalInterface
    public interface StampaMaiuscolo {
         String stampa(String testo);
    }
}
