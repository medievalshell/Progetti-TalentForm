package com.collections;

import java.util.*;

public class ExampleArrayList {

//	public static void main(String[] args) {
//		
//		
//
//		  List<String> names = new ArrayList<String>();
//
//
//	      names.add("anna");
//	      names.add("marco");
//	      names.add("antonio");
//
//	      names.set(1, "luca");
//	      
//	      Collections.reverse(names);
//		
//		
//	      for (String people : names) {
//
//				System.out.println(people);
//			}
//		
//		
//		
//		List<Integer> numbers = new ArrayList<Integer>();
//
//		numbers.add(5);
//		numbers.add(4);
//		numbers.add(3);
//		numbers.add(2);
//		numbers.add(1);
//		numbers.remove(3);
//
//		Collections.sort(numbers);
//
//		for (int namess : numbers) {
//
//			System.out.println(namess);
//		}
//
//		System.out.println("---------");
//
//		System.out.println(numbers.size());
//
//		System.out.println();
//
//	}
	//Traccia: Stampa l’ultimo elemento della lista di stringhe senza utilizzare get
//	public static void main(String[] args) {
//		List<String> str = new ArrayList<String>();
//		str.add("ciao");
//		str.add("testo");
//		str.add("test");
//		str.add("hello");
//		str.add("world");
//		List<String> str1= new ArrayList<String>(str);
//		System.out.println(str1);
//	}
//	
//	public static class Studente {
//		 protected String nome;
//		 protected String cognome;
//		 protected int eta;
//		 public Studente(String nome, String cognome, int eta) {
//		        super();
//		        this.nome = nome;
//		        this.cognome = cognome;
//		        this.eta = eta;
//		 }
//		 public String getNome() {
//		        return nome;
//		 }
//		 public void setNome(String nome) {
//		        this.nome = nome;
//		 }
//		 public String getCognome() {
//		        return cognome;
//		 }
//		 public void setCognome(String cognome) {
//		        this.cognome = cognome;
//		 }
//		 public int getEta() {
//		        return eta;
//		 }
//		 public void setEta(int eta) {
//		        this.eta = eta;
//		 }
//		 @Override
//		    public String toString() {
//		        return "Studente [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
//		 }
//	}
//	public static void main(String[] args) {
//		List<Studente> studenti = new ArrayList<>();
//		studenti.add(new Studente("Andrea", "Padula", 27));
//		studenti.add(new Studente("Christian", "Spanu", 25));
//		studenti.add(new Studente("Sara", "Mazzeo", 26));
//		studenti.add(new Studente("Andrea", "Padula", 27));
//		studenti.add(new Studente("Andrea", "Padula", 27));
//		List<Studente> studenti1= new ArrayList<>();
//		studenti1.add(new Studente("Nicola", "Narducci", 22));
//		studenti1.add(new Studente("Ruben", "Cirelli", 30));
//		studenti1.add(new Studente("Alberto", "Alagna", 24));
//		studenti.add(new Studente("Andrea", "Padula", 27));
//		studenti.add(new Studente("Andrea", "Padula", 27));
//		studenti.add(new Studente("Andrea", "Padula", 27));
//		studenti.addAll(studenti1);
//		System.out.println("------------------------------------------------------------");
//		System.out.println(studenti);
//		System.out.println("------------------------------------------------------------");
//		studenti.sort(Comparator.comparingInt(s1 -> s1.getEta()));
//		int contatore=0;
//		for(Studente s : studenti) {
//			if(s.getNome().equals("Andrea"))
//				contatore++;
//		}
//		System.out.println("Lo studente Andrea è ripetuto: " + contatore);
//		System.out.println("------------------------------------------------------------");
//		for(Studente s1 : studenti) {
//			System.out.println(s1);
//			System.out.println("------------------------------------------------------------");
//		}
//		int etaMassima = 0;
//		Studente studentePiuVecchio = null;
//		for(Studente s2 : studenti) {
//			if (s2.getEta() > etaMassima) {
//				etaMassima = s2.getEta();
//				studentePiuVecchio = s2;
//            }
//		}
//		if (studentePiuVecchio != null) {
//			System.out.println("Lo studente con l'età maggiore è: " + studentePiuVecchio.getNome() + " con " + etaMassima + " anni.");
//			System.out.println("------------------------------------------------------------");
//		} else {
//			System.out.println("Nessun studente trovato nella lista.");
//			System.out.println("------------------------------------------------------------");
//		}
//	}
	
	//Traccia:Trova gli elementi presenti in set1 ma non in set2.
//	public static void main(String[] args) {
//		HashSet<String> città = new HashSet<String>();
//		città.add("Roma");
//		città.add("Milano");
//		città.add("Torino");
//		città.add("Brindisi");
//		città.add("Venezia");
//		HashSet<String> città1 = new HashSet<String>();
//		città1.add("Napoli");
//		città1.add("Bari");
//		città1.add("Brindisi");
//		città1.add("Milano");
//		città1.add("Roma");
//		città.removeAll(città1);
//		System.out.println(città);
//	}
	
//	public static void main(String[] args) {
//		List<Integer> num = new ArrayList<>(List.of(1,2,2,3,5,6,6,7));
//		int maxL = 1, L = 1;
//		for (int i=1;  i < num.size(); i++) { if (num.get(i) > num.get(i-1)) {L++;}else {L=1;}maxL = Math.max(maxL, L);}
//		System.out.println(maxL);
//	}
	
	public static void main(String[] args) {
		
	}
}
