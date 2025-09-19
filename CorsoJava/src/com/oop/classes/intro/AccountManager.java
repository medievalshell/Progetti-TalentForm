package com.oop.classes.intro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class AccountManager {
    private List<AccountProperties> accounts;
	private static final String FILE_NAME = "accounts.ser";

    public AccountManager() {
    	this.accounts = loadAccounts();
    }
    
    public void saveAccounts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(accounts);
            System.out.println("Accounts salvati con successo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
	private List<AccountProperties> loadAccounts() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                return (List<AccountProperties>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new ArrayList<>(); // Ritorna una lista vuota se il file non esiste
    }

    public void addAccount(AccountProperties account) {
        accounts.add(account);
    }

    public List<AccountProperties> getAccounts() {
        return accounts;
    }
    
    public void removeAccount(AccountProperties account) {
        accounts.remove(account);
        saveAccounts(); // Salva subito dopo aver rimosso
    }
}