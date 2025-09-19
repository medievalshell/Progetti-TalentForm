package com.oop.classes.intro;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class BankAccountPanel extends JPanel {
    private BankAccount account;
    private JLabel saldoLabel;
    private JTextField field;

    public BankAccountPanel() {
        account = new BankAccount();
        setLayout(new GridLayout(0,2,5,5));

        saldoLabel = new JLabel("Saldo attuale: " + account.getBalance());

        JButton firstDepositBtn = new JButton("Primo Deposito");
        JButton firstDrawBtn = new JButton("Primo Prelievo");
        JButton secondDepositBtn = new JButton("Secondo Deposito");
        JButton secondDrawBtn = new JButton("Secondo Prelievo");

        field = new JTextField();

        add(new JLabel("Importo:")); add(field);
        add(firstDepositBtn); add(firstDrawBtn);
        add(secondDepositBtn); add(secondDrawBtn);
        add(new JLabel("")); add(saldoLabel);

        firstDepositBtn.addActionListener(e -> aggiorna("firstDeposit"));
        firstDrawBtn.addActionListener(e -> aggiorna("firstDraw"));
        secondDepositBtn.addActionListener(e -> aggiorna("secondDeposit"));
        secondDrawBtn.addActionListener(e -> aggiorna("secondDraw"));
    }

    private void aggiorna(String tipo) {
        try {
            int valore = Integer.parseInt(field.getText());
            switch (tipo) {
                case "firstDeposit" -> account.setFirstDeposit(valore);
                case "firstDraw" -> account.setFirstDraw(valore);
                case "secondDeposit" -> account.setSecondDeposit(valore);
                case "secondDraw" -> account.setSecondDraw(valore);
            }
            saldoLabel.setText("Saldo attuale: " + account.getBalance());
            field.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Inserisci un numero valido!");
        }
    }
}
