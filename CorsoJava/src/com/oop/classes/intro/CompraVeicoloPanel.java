package com.oop.classes.intro;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class CompraVeicoloPanel extends JPanel {
    private AnagraficaManager anagraficaManager;
    private List<Veicolo> veicoliDisponibili;
    private JComboBox<String> anagraficaComboBox;
    private JComboBox<String> accountComboBox;
    private JList<String> veicoliList;
    private DefaultListModel<String> veicoliListModel;

    public CompraVeicoloPanel(AnagraficaManager anagraficaManager, List<Veicolo> veicoliDisponibili) {
        this.anagraficaManager = anagraficaManager;
        this.veicoliDisponibili = veicoliDisponibili;
        setLayout(new BorderLayout(10, 10));

        // Pannello superiore per la selezione dell'anagrafica e dell'account
        JPanel topPanel = new JPanel(new FlowLayout());
        anagraficaComboBox = new JComboBox<>();
        accountComboBox = new JComboBox<>();
        
        // Aggiungi un listener al ComboBox dell'anagrafica
        anagraficaComboBox.addActionListener(e -> aggiornaAccountComboBox());

        topPanel.add(new JLabel("Seleziona Anagrafica:"));
        topPanel.add(anagraficaComboBox);
        topPanel.add(new JLabel("Seleziona Conto:"));
        topPanel.add(accountComboBox);

        // Lista dei veicoli disponibili
        veicoliListModel = new DefaultListModel<>();
        veicoliList = new JList<>(veicoliListModel);
        JScrollPane scrollPane = new JScrollPane(veicoliList);

        // Bottone per l'acquisto
        JButton compraBtn = new JButton("Compra Veicolo");
        compraBtn.addActionListener(e -> compraVeicolo());

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(compraBtn, BorderLayout.SOUTH);

        aggiornaListe();
    }

    public void aggiornaListe() {
        // Aggiorna la lista delle anagrafiche
        anagraficaComboBox.removeAllItems();
        for (Anagrafica anagrafica : anagraficaManager.getAnagrafiche()) {
            anagraficaComboBox.addItem(anagrafica.getNome() + " " + anagrafica.getCognome());
        }

        // Aggiorna la lista dei veicoli disponibili
        veicoliListModel.clear();
        for (Veicolo v : veicoliDisponibili) {
            veicoliListModel.addElement(v.getMarca() + " " + v.getModello() + " - " + v.getPrezzo() + "€");
        }
    }

    private void aggiornaAccountComboBox() {
        accountComboBox.removeAllItems();
        int anagraficaIndex = anagraficaComboBox.getSelectedIndex();
        if (anagraficaIndex != -1) {
            Anagrafica anagrafica = anagraficaManager.getAnagrafiche().get(anagraficaIndex);
            for (AccountProperties account : anagrafica.getAccounts()) {
                accountComboBox.addItem(account.getAccountType() + " (" + account.getAccountNumber() + ")");
            }
        }
    }
    
    private void compraVeicolo() {
        int anagraficaIndex = anagraficaComboBox.getSelectedIndex();
        int veicoloIndex = veicoliList.getSelectedIndex();
        int accountIndex = accountComboBox.getSelectedIndex();

        if (anagraficaIndex == -1 || veicoloIndex == -1 || accountIndex == -1) {
            JOptionPane.showMessageDialog(this, "Seleziona un'anagrafica, un account e un veicolo.");
            return;
        }

        Anagrafica anagrafica = anagraficaManager.getAnagrafiche().get(anagraficaIndex);
        Veicolo veicolo = veicoliDisponibili.get(veicoloIndex);
        AccountProperties account = anagrafica.getAccounts().get(accountIndex);

        // Verifica il saldo
        if (account.getBalance() >= veicolo.getPrezzo()) {
            account.withdraw((int) veicolo.getPrezzo());
            anagrafica.addVeicolo(veicolo);
            veicoliDisponibili.remove(veicoloIndex);
            
            JOptionPane.showMessageDialog(this, "Acquisto effettuato con successo!");
            aggiornaListe();
        } else {
            JOptionPane.showMessageDialog(this, "Saldo insufficiente per l'acquisto.");
        }
    }
}
