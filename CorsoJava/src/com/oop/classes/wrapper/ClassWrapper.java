package com.oop.classes.wrapper;

public class ClassWrapper {
	public static void main(String[] args) {
		// BOXING
		Integer number = Integer.valueOf(5);
		System.out.println(number);
		Double db = Double.valueOf(50.0d);
		String a = "true";
		String c = "ciao";
		String b = a.concat(c);
		System.out.println(b);
		boolean a1 = Boolean.parseBoolean(a);
		System.out.println(a1);
		Integer[] arr = new Integer[10];
		Integer[] arr1 =  {1, 2, 3, 4, 5, 6};
		for (Integer element : arr) {
            System.out.print(element + " ");
        }
		for (Integer element : arr1) {
            System.out.print(element + " ");
        }
		// AUTOBOXING
		Integer numbers = 35;
		System.out.println(numbers);
		Double db1 = 22.5d;
		// UNBOXING	
		int nb = number;
		System.out.println(nb);
	}
}
