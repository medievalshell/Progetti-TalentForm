package com.DebuggingUnitTest.ExercicesUnitTestAssertsException;



import static junit.framework.TestCase.*;

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
            if ((amount > 500.00) & !branch) {
                throw new IllegalArgumentException();
            }

            balance -= amount;
            return balance;
        }

        public double getBalance() {
            return balance;
        }

        public boolean isChecking() {
            return accountType == CHECKING;
        }



    }

    public class BankAccountTest {

        private BankAccount account;
        private static int count;

        @org.junit.BeforeClass
        public static void beforeClass() {
            System.out.println("This executes before any test cases. Count = " + count++);
        }

        @org.junit.Before
        public void setup() {
            account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
            System.out.println("Running a test...");
        }

        @org.junit.Test
        public void deposit() throws Exception {
            double balance = account.deposit(200.00, true);
            assertEquals(1200.00, balance, 0);
        }

        @org.junit.Test
        public void withdraw_branch() throws Exception {
            double balance = account.withdraw(600.00, true);
            assertEquals(400.00, balance, 0);
        }

        @org.junit.Test(expected = IllegalArgumentException.class)
        public void withdraw_notBranch() throws Exception {
            double balance = account.withdraw(600.00, false);
            assertEquals(400.00, balance, 0);
        }

        @org.junit.Test
        public void getBalance_deposit() throws Exception {
            account.deposit(200.00, true);
            assertEquals(1200.00, account.getBalance(), 0);
        }

        @org.junit.Test
        public void getBalance_withdraw() throws Exception {
            account.withdraw(200.00, true);
            assertEquals(800.00, account.getBalance(), 0);
        }

        @org.junit.Test
        public void isChecking_true() {
            assertTrue("The account is NOT a checking account", account.isChecking());
        }

        @org.junit.AfterClass
        public static void afterClass() {
            System.out.println("This executes after any test cases. Count = " + count++);
        }

        @org.junit.After
        public void teardown() {
            System.out.println("Count = " + count++);
        }

    }

}



