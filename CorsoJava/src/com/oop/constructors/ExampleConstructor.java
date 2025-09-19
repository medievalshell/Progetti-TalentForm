package com.oop.constructors;

public class ExampleConstructor {
	
	
	 public int id;
	    public String name;
	    public int age;


	    public ExampleConstructor(int id, String name, int age) {

	        this.id = id;
	        this.name = name;
	        this.age = age;


	    }


	    public static void main(String[] args) {


	    	ExampleConstructor student = new ExampleConstructor(1, "Fabio", 37);

	        System.out.println(student.id);
	        System.out.println(student.name);
	        System.out.println(student.age);

	    }


}
