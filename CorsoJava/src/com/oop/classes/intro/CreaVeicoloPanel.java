package com.oop.classes.intro;



import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreaVeicoloPanel extends JPanel {
    private JTextField marcaField, modelloField, targaField, velocitaField, prezzoField;
    private JCheckBox antifurtoCheck;
    private JComboBox<String> tipoVeicoloCombo;
    private List<Veicolo> veicoliDisponibili;

    public CreaVeicoloPanel(List<Veicolo> veicoliDisponibili) {
        this.veicoliDisponibili = veicoliDisponibili;
        setLayout(new GridLayout(0, 2, 5, 5));

        marcaField = new JTextField();
        modelloField = new JTextField();
        targaField = new JTextField();
        velocitaField = new JTextField();
        prezzoField = new JTextField();
        antifurtoCheck = new JCheckBox("Attivo");
        tipoVeicoloCombo = new JComboBox<>(new String[]{"Auto", "Moto"});

        // Aggiungi i componenti al pannello
        add(new JLabel("Tipo Veicolo:")); add(tipoVeicoloCombo);
        add(new JLabel("Marca:")); add(marcaField);
        add(new JLabel("Modello:")); add(modelloField);
        add(new JLabel("Targa:")); add(targaField);
        add(new JLabel("Velocità Massima:")); add(velocitaField);
        add(new JLabel("Prezzo:")); add(prezzoField);
        add(new JLabel("Antifurto:")); add(antifurtoCheck);

        JButton creaBtn = new JButton("Crea Veicolo");
        creaBtn.addActionListener(e -> creaVeicolo());
        add(creaBtn);
    }

    private void creaVeicolo() {
        try {
            String tipo = (String) tipoVeicoloCombo.getSelectedItem();
            String marca = marcaField.getText();
            String modello = modelloField.getText();
            String targa = targaField.getText();
            int velocita = Integer.parseInt(velocitaField.getText());
            double prezzo = Double.parseDouble(prezzoField.getText());
            boolean antifurto = antifurtoCheck.isSelected();

            Veicolo nuovoVeicolo;
            if (tipo.equals("Auto")) {
                nuovoVeicolo = new Auto(marca, modello, targa, velocita, prezzo, antifurto);
            } else {
                nuovoVeicolo = new Moto(marca, modello, targa, velocita, prezzo, antifurto);
            }

            veicoliDisponibili.add(nuovoVeicolo);
            JOptionPane.showMessageDialog(this, "Veicolo creato con successo!");
            // Pulisci i campi
            marcaField.setText("");
            modelloField.setText("");
            targaField.setText("");
            velocitaField.setText("");
            prezzoField.setText("");
            antifurtoCheck.setSelected(false);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Errore: Inserisci numeri validi per velocità e prezzo.");
        }
    }
}