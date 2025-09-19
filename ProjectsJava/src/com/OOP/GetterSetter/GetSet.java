package com.OOP.GetterSetter;


public class GetSet {

    private String name;
    private String surname;


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }


    public static void main(String[] args) {


        GetSet profile = new GetSet();


        profile.setName("fabio");
        profile.setSurname("di gloria");


        System.out.println(profile.getName());
        System.out.println(profile.getSurname());


    }


}