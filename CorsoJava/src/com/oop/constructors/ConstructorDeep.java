package com.oop.constructors;

import com.oop.constructors.ExerciceConstructorDeep;

public class ConstructorDeep {
	
	public static void main(String[] args) {

        ExerciceConstructorDeep customer = new ExerciceConstructorDeep("Tim", 1000,
                "tim@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        ExerciceConstructorDeep secondCustomer = new  ExerciceConstructorDeep();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        ExerciceConstructorDeep thirdCustomer = new  ExerciceConstructorDeep("Joe", "joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
    }

}
