package com.oop.record;

record Client(String name, int age) {

    public Client {
        if (name == "Fabio")
            throw new IllegalArgumentException("String failed");

    }
}


public class Record {
	
	public static void main(String[] args) {

        Client cl = new Client("fabio", 37);

        System.out.println(cl.name());
        System.out.println(cl.age());

}

}
