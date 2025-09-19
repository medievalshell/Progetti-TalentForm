package com.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		{
			String  frase = "Ho unà REGEX m01to Pòt€nté";
			//String  frase = "Regex e molto potente";
//			Matcher matcher = Pattern.compile("\\^[A-Z0-9]{16}$\\b\\w+\\b\\s+\\").matcher(frase);
			Matcher matcher = Pattern.compile("\s+\\d\\w").matcher(frase);
			int c = 0;
			while (matcher.find()) {
				c++;
			}
			System.out.println(c);
			
		}
		{
			String  cF = "PDLNDR97S11B180U";
			boolean ck = cF.matches("^[A-Z0-9]{16}$");
			System.out.println(ck);
			
		}
		{
			String  iban = "IT34604833148244631178";
			boolean IcK = iban.matches("^[A-Z]{2}\\d{2}[A-Z0-9]{1,30}$");
			System.out.println(IcK);
		}

	}

}
