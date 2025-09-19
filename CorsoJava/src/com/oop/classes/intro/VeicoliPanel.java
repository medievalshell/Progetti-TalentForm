package com.oop.classes.intro;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class VeicoliPanel extends JPanel {
    private JPanel listPanel;
    private JLabel infoLabel;

    public VeicoliPanel() {
        setLayout(new BorderLayout());
        infoLabel = new JLabel("Seleziona un veicolo per i dettagli");
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(infoLabel, BorderLayout.NORTH);

        listPanel = new JPanel();
        listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(listPanel);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void mostraVeicoli(Anagrafica anagrafica) {
        listPanel.removeAll();
        if (anagrafica != null && anagrafica.getVeicoliPosseduti() != null) {
            for (Veicolo v : anagrafica.getVeicoliPosseduti()) {
                JButton veicoloBtn = new JButton(v.getMarca() + " " + v.getModello() + " (" + v.getTarga() + ")");
                veicoloBtn.addActionListener(e -> mostraDettagliVeicolo(v));
                listPanel.add(veicoloBtn);
            }
        }
        listPanel.revalidate();
        listPanel.repaint();
    }
    
    private void mostraDettagliVeicolo(Veicolo veicolo) {
        // Logica per mostrare i dettagli e la velocità
        String inputVelocita = JOptionPane.showInputDialog(this, "A che velocità stai andando? (km/h)");
        if (inputVelocita != null && !inputVelocita.isEmpty()) {
            try {
                int velocitaAttuale = Integer.parseInt(inputVelocita);
                if (veicolo.isAntifurtoAttivo() && velocitaAttuale > 130) {
                    JOptionPane.showMessageDialog(this, "Attenzione: L'antifurto è attivo! Non puoi superare i 130 km/h.");
                } else if (velocitaAttuale > veicolo.getVelocitaMassima()) {
                    JOptionPane.showMessageDialog(this, "Non puoi superare la velocità massima del veicolo (" + veicolo.getVelocitaMassima() + " km/h).");
                } else {
                    JOptionPane.showMessageDialog(this, "Stai viaggiando a " + velocitaAttuale + " km/h.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Inserisci un valore numerico valido.");
            }
        }
    }
}
