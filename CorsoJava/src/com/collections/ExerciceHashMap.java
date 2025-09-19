package com.collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ExerciceHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> images = new HashMap<>();

		images.put(1, "auto.png");
		images.put(2, "frutta.png");
		images.put(3, "articoli.png");

		System.out.println("Images map is:" + images.size());

		System.out.println(images);

		if (images.containsKey(2)) {

			// Mapping
			String img = images.get(2);

			// Printing value for the corresponding key
			System.out.println("value for key" + " \"frutta\" is:- " + img);

		}
	}
	
//		public static void main(String[] args) {
//			HashMap<Integer, String> nomi = new HashMap<>();nomi.put(1, "Andrea"); nomi.put(2, "Fabio");nomi.put(3, "Alberto");
//			System.out.println("nomi map is:" + nomi.size());System.out.println(nomi);
//			if (nomi.containsKey(2)) {String n = nomi.get(2);System.out.println("value for key" + " \"Fabio\" is:- " + n);}
//		}
//		public static void main(String[] args) {
//			String[] arr1 = new  String[5];arr1[0] = "Andrea";arr1[1] = "Fabio";arr1[2] = "Alberto";arr1[3] = "Christian";arr1[4] = "Nicola";
//			int[] arr2 = new  int[5];arr2[0] = 10;arr2[1] = 20;arr2[2] = 30;arr2[3] = 40;arr2[4] = 50;
//			HashMap<Integer, String> persone = new HashMap<>();for (int i = 0; i < arr2.length; i++) {persone.put(arr2[i], arr1[i]);}System.out.println(persone);
//		}
//		public static void main(String[] args) {
//			List<Integer> n = new ArrayList<>(List.of(1,2,3));List<String> c = new ArrayList<>(List.of("a","b","c"));HashMap<Integer, String> nc = new HashMap<>();
//			for (int i = 0; i < n.size(); i++) {nc.put(n.get(i), c.get(i));}System.out.println(nc);
//		}
}
