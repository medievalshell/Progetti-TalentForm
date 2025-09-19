package com.DebuggingUnitTest.ExercicesUnitTestAsserts;


import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class Main {

    public static void main(String[] args) {
        System.out.println("The application is running");
    }

    public class BankAccount {

        private String firstName;
        private String lastName;
        private double balance;

        public static final int CHECKING = 1;
        public static final int SAVINGS = 2;

        private int accountType;

        public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.balance = balance;
            this.accountType = typeOfAccount;
        }


        public double deposit(double amount, boolean branch) {
            balance += amount;
            return balance;
        }


        public double withdraw(double amount, boolean branch) {
            balance -= amount;
            return balance;
        }

        public double getBalance() {
            return balance;
        }

        public boolean isChecking() {
            return accountType == CHECKING;
        }


        public class BankAccountTest {
            @org.junit.Test
            public void deposit() throws Exception {
                BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
                double balance = account.deposit(200.00, true);
                assertEquals(1200.00, balance, 0);
            }

            @org.junit.Test
            public void withdraw() throws Exception {
                fail("This test has yet to be implemented");
            }

            @org.junit.Test
            public void getBalance_deposit() throws Exception {
                BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
                account.deposit(200.00, true);
                assertEquals(1200.00, account.getBalance(), 0);
            }

            @org.junit.Test
            public void getBalance_withdraw() throws Exception {
                BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
                account.withdraw(200.00, true);
                assertEquals(800.00, account.getBalance(), 0);
            }

            @org.junit.Test
            public void isChecking_true() {
                BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
                assertTrue("The account is NOT a checking account", account.isChecking());

            }

        }



    }

}



