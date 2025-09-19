package com.oop.constructors;

public class ExerciceConstructorDeep {
	
	private String name;
    private double creditLimit;
    private String email;

    public ExerciceConstructorDeep() {
        this("Nobody", "nobody@nowhere.com");
    }

    public  ExerciceConstructorDeep(String name, String email) {
        this(name, 1000, email);
    }

    public  ExerciceConstructorDeep(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
