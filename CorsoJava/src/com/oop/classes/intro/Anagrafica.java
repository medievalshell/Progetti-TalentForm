package com.oop.classes.intro;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrafica implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome;
    private String cognome;
    private List<AccountProperties> accounts;
    private Map<String, String> customProperties;
    private List<Veicolo> veicoliPosseduti;
    
    public Anagrafica(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.accounts = new ArrayList<>();
        this.customProperties = new HashMap<>();
        this.veicoliPosseduti = new ArrayList<>();
    }

    public Anagrafica() {
        this.accounts = new ArrayList<>();
        this.customProperties = new HashMap<>();
        this.veicoliPosseduti = new ArrayList<>();
    }
    
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        if (veicoliPosseduti == null) {
            veicoliPosseduti = new ArrayList<>();
        }
    }

    // Metodi Getter e Setter
    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public List<AccountProperties> getAccounts() { return accounts; }
    public Map<String, String> getCustomProperties() { return customProperties; }

    public void addAccount(AccountProperties account) {
        this.accounts.add(account);
    }
    
    public void removeAccount(AccountProperties account) {
        this.accounts.remove(account);
    }
    
    public void addCustomProperty(String key, String value) {
        this.customProperties.put(key, value);
    }
    public void addVeicolo(Veicolo veicolo) {
        this.veicoliPosseduti.add(veicolo);
    }
    
    public List<Veicolo> getVeicoliPosseduti() {
        return veicoliPosseduti;
    }
    
    public void initVeicoliPosseduti() {
        if (this.veicoliPosseduti == null) {
            this.veicoliPosseduti = new ArrayList<>();
        }
    }

    @Override
    public String toString() {
        return nome + " " + cognome;
    }
}
