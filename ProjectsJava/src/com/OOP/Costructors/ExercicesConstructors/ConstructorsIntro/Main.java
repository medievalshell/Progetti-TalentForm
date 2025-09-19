package com.OOP.Costructors.ExercicesConstructors.ConstructorsIntro;

import com.OOP.Costructors.ExercicesConstructors.Account;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("12345", 500,
                "Bob Brown", "myemail@bob.com",
                "(087) 123-4567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());


        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);
    }
}
