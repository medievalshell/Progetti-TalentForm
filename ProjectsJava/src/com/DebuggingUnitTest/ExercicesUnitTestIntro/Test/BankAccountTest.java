package com.DebuggingUnitTest.ExercicesUnitTestIntro.Test;

import com.DebuggingUnitTest.ExercicesUnitTestIntro.BankAccount;

import static junit.framework.TestCase.fail;
import static junit.framework.TestCase.assertEquals;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() throws Exception {
        fail("This test has yet to be implemented");
    }


    @org.junit.Test
    public void getBalance() throws Exception {
        BankAccount account = new BankAccount("fabio","di gloria",1000);
        account.deposit(200);
        assertEquals(1200,account.getBalance(),0);
    }
}
