package com.example.demo;

import java.util.List;

public class UserModel {
	
	  private int id;
	    private String descrizione;
	    private List<String> name;
	    private int age;

	  
	    public UserModel(int id, String descrizione, List<String> name, int age) {
	        this.id = id;
	        this.descrizione = descrizione;
	        this.name = name;
	        this.age = age;
	    }

	    // Getters e setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getDescrizione() {
	        return descrizione;
	    }

	    public void setDescrizione(String descrizione) {
	        this.descrizione = descrizione;
	    }

	    public List<String> getName() {
	        return name;
	    }

	    public void setName(List<String> name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	
}
