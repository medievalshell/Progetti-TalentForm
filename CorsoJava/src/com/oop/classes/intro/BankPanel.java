package com.oop.classes.intro;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BankPanel extends JPanel {
    private AnagraficaManager anagraficaManager;
    private DefaultListModel<String> contiListModel;
    private JList<String> contiList;
    private Anagrafica anagraficaCorrente;

    public BankPanel(AnagraficaManager anagraficaManager) {
        this.anagraficaManager = anagraficaManager;
        setLayout(new BorderLayout(10, 10));

        // Inizializza il modello e la lista per visualizzare i conti
        contiListModel = new DefaultListModel<>();
        contiList = new JList<>(contiListModel);
        
        // Aggiungi la lista dei conti a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(contiList);
        add(scrollPane, BorderLayout.CENTER);
        
        // Pannello per i bottoni
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        
        JButton creaContoBtn = new JButton("Crea Conto");
        creaContoBtn.addActionListener(e -> showCreateAccountDialog());
        
        JButton eliminaContoBtn = new JButton("Elimina Conto");
        eliminaContoBtn.addActionListener(e -> showDeleteAccountDialog());

        JButton aggiungiFondiBtn = new JButton("Aggiungi Fondi");
        aggiungiFondiBtn.addActionListener(e -> showDepositDialog());
        
        JButton prelevaFondiBtn = new JButton("Preleva Fondi");
        prelevaFondiBtn.addActionListener(e -> showWithdrawDialog());
        
        JButton calcolaTasseBtn = new JButton("Calcola Tasse");
        calcolaTasseBtn.addActionListener(e -> calcolaTasse());
        
        buttonPanel.add(creaContoBtn);
        buttonPanel.add(eliminaContoBtn);
        buttonPanel.add(aggiungiFondiBtn);
        buttonPanel.add(prelevaFondiBtn);
        buttonPanel.add(calcolaTasseBtn);

        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    public void aggiornaConti(Anagrafica anagrafica) {
        this.anagraficaCorrente = anagrafica;
        contiListModel.clear();
        if (anagrafica != null) {
            for (AccountProperties account : anagrafica.getAccounts()) {
                contiListModel.addElement(account.getAccountType() + " (" + account.getAccountNumber() + ") - Saldo: " + account.getBalance() + "€");
            }
        }
    }
    
    private void showCreateAccountDialog() {
        if (anagraficaCorrente == null) {
            JOptionPane.showMessageDialog(this, "Seleziona prima un'anagrafica.", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String[] options = {"Conto Corrente", "Conto Risparmio"};
        int type = JOptionPane.showOptionDialog(this,
                "Scegli il tipo di account da creare:",
                "Crea Nuovo Account",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (type == 0) {
            anagraficaCorrente.addAccount(new CheckingAccount(new Random().nextInt(100000), anagraficaCorrente.getNome()));
        } else if (type == 1) {
            anagraficaCorrente.addAccount(new SavingsAccount(new Random().nextInt(100000), anagraficaCorrente.getNome(), 0.05));
        }
        
        aggiornaConti(anagraficaCorrente);
        anagraficaManager.saveAnagrafiche();
    }
    
    private void showDeleteAccountDialog() {
        if (anagraficaCorrente == null) {
            JOptionPane.showMessageDialog(this, "Seleziona prima un'anagrafica.", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int selectedIndex = contiList.getSelectedIndex();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Seleziona un conto da eliminare.", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }

        AccountProperties accountToDelete = anagraficaCorrente.getAccounts().get(selectedIndex);
        anagraficaCorrente.removeAccount(accountToDelete);
        
        aggiornaConti(anagraficaCorrente);
        anagraficaManager.saveAnagrafiche();
    }
    
    private void showDepositDialog() {
        int selectedIndex = contiList.getSelectedIndex();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Seleziona un conto.", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String input = JOptionPane.showInputDialog("Inserisci l'importo da aggiungere:");
        if (input != null) {
            try {
                double amount = Double.parseDouble(input);
                if (amount > 0) {
                    AccountProperties account = anagraficaCorrente.getAccounts().get(selectedIndex);
                    account.deposit(amount);
                    JOptionPane.showMessageDialog(this, "Aggiunto " + amount + "€ al conto " + account.getAccountNumber());
                    aggiornaConti(anagraficaCorrente);
                    anagraficaManager.saveAnagrafiche();
                } else {
                    JOptionPane.showMessageDialog(this, "L'importo deve essere positivo.", "Errore", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Inserisci un importo valido.", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void showWithdrawDialog() {
        int selectedIndex = contiList.getSelectedIndex();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Seleziona un conto.", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String input = JOptionPane.showInputDialog("Inserisci l'importo da prelevare:");
        if (input != null) {
            try {
                double amount = Double.parseDouble(input);
                if (amount > 0) {
                    AccountProperties account = anagraficaCorrente.getAccounts().get(selectedIndex);
                    if (account.withdraw(amount)) {
                        JOptionPane.showMessageDialog(this, "Prelevato " + amount + "€ dal conto " + account.getAccountNumber());
                        aggiornaConti(anagraficaCorrente);
                        anagraficaManager.saveAnagrafiche();
                    } else {
                        JOptionPane.showMessageDialog(this, "Fondi insufficienti.", "Errore", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "L'importo deve essere positivo.", "Errore", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Inserisci un importo valido.", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void calcolaTasse() {
        if (anagraficaCorrente == null) {
            JOptionPane.showMessageDialog(this, "Seleziona prima un'anagrafica.", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double totalTaxes = 0;
        for (AccountProperties account : anagraficaCorrente.getAccounts()) {
            if (account instanceof SavingsAccount) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                totalTaxes += savingsAccount.calculateTax();
            }
        }
        JOptionPane.showMessageDialog(this, "Tasse totali da pagare: " + totalTaxes + "€", "Tasse sui Conti Risparmio", JOptionPane.INFORMATION_MESSAGE);
    }
}