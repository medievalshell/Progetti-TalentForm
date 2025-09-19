package com.regular.expression;

import java.util.regex.Pattern;

public class Patter {

	public static void main(String[] args) {
		
		   Pattern p = Pattern.compile("\\d");

			String elenco = "1. Juventus, 2. Roma, 3. Napoli, 4. Atalanta, 5. Lazio";

			String[] elencoArray = p.split(elenco);
	        for (int i = 1; i < elencoArray.length; i++) {
				System.out.println(i + elencoArray[i].replaceAll(",", ""));}
	        
	        

			String testo = "info@paolopreite.it";

			boolean match = Pattern.matches(".*@.*", testo);
			System.out.println("il testo contiene la @? " + match);


			

	 

	}

}
