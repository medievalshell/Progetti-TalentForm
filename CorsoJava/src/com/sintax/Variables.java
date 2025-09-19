package com.sintax;

public class Variables {
	
	 private static int cod = 25; // variabile di classe

	    public static void main(String[] args) {

	        String name = "fabio";

	        int number = 50;              
	        String word = "word";
	        boolean ok = true;
	        char symbol = 'a';
	        long pIva = 1243456789;


	        System.out.println(number);
	        System.out.println(word);
	        System.out.println(ok);
	        System.out.println(symbol);
	        System.out.println(pIva);


	        String currentYear = "2024";
	        int year = Integer.parseInt(currentYear);
	        System.out.println(year);

	        String price = "22.5";
	        double priceShoes = Double.parseDouble(price);
	        System.out.println(priceShoes);


	    }

}
