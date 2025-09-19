package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExampleIterator {

	public static void main(String[] args) {
		
//		  List<String> names = new ArrayList<String>();
//
//	        names.add("luca");
//	        names.add("paolo");
//	        names.add("marco");
//	        names.add("anna");
//	        names.remove("luca");
//
//
//	        Iterator<String> it = names.iterator();
//
//
//	        while (it.hasNext()) {
//
//	            String students = it.next();
//
//	            System.out.println(students);
//
//
//	        }
		//Verifica se un elemento è presente
		List<String> colors = new ArrayList<>(Arrays.asList("blue","red","green"));
		Iterator<String> it = colors.iterator();
		boolean isIn = false;
		while (it.hasNext()) {
			if (it.next().equals("blue")) {
				isIn = true;
				break;
			}
		}
		System.out.println("E' presente: " + isIn);
	}

}
