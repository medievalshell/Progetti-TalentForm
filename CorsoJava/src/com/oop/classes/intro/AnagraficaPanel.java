package com.oop.classes.intro;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

@SuppressWarnings("serial")
public class AnagraficaPanel extends JPanel {
    private AnagraficaManager anagraficaManager;
    private JPanel mainPanel;
    private JPanel anagraficaListPanel;
    private JTabbedPane detailsTabbedPane; 
    private JPanel dettagliPanel; 
    private BankPanel bankPanel; 
    private VeicoliPanel veicoliPanel; 
    private JLabel nomeLabelValue;
    private JLabel cognomeLabelValue;
    private JPanel customPropertiesPanel;

    public AnagraficaPanel(AnagraficaManager anagraficaManager) {
        this.anagraficaManager = anagraficaManager;
        setLayout(new BorderLayout());

        // Pannello per la lista delle anagrafiche (a sinistra)
        anagraficaListPanel = new JPanel(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(anagraficaListPanel);
        scrollPane.setPreferredSize(new Dimension(250, 0));
        add(scrollPane, BorderLayout.WEST);

        // Pannello principale per i dettagli (a destra) con CardLayout
        mainPanel = new JPanel(new CardLayout());
        
        // --- Crea le tab una sola volta nel costruttore ---
        detailsTabbedPane = new JTabbedPane();
        dettagliPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        
        // Inizializza le etichette per i dettagli
        dettagliPanel.add(new JLabel("Nome:"));
        nomeLabelValue = new JLabel();
        dettagliPanel.add(nomeLabelValue);
        dettagliPanel.add(new JLabel("Cognome:"));
        cognomeLabelValue = new JLabel();
        dettagliPanel.add(cognomeLabelValue);
        
        // Pannello per i campi personalizzati (inizialmente vuoto)
        customPropertiesPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        dettagliPanel.add(customPropertiesPanel);

        // Aggiungi un bottone per i campi personalizzati
        JButton addFieldBtn = new JButton("Aggiungi Campo");
        dettagliPanel.add(addFieldBtn);
        
        // Inizializza i pannelli delle altre tab
        bankPanel = new BankPanel(anagraficaManager);
        veicoliPanel = new VeicoliPanel();
        
        detailsTabbedPane.addTab("Dettagli", dettagliPanel);
        detailsTabbedPane.addTab("Conti", bankPanel);
        detailsTabbedPane.addTab("Veicoli", veicoliPanel);

        // Aggiungi il JTabbedPane al mainPanel
        mainPanel.add(detailsTabbedPane, "DETAILS");

        add(mainPanel, BorderLayout.CENTER);
        refreshAnagraficaListPanel();
    }
    
    // Metodo per aggiornare l'elenco delle anagrafiche
    private void refreshAnagraficaListPanel() {
        anagraficaListPanel.removeAll();
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        for (Anagrafica anagrafica : anagraficaManager.getAnagrafiche()) {
            JButton anagraficaBtn = new JButton(anagrafica.toString());
            anagraficaBtn.setMaximumSize(new Dimension(300, 40));
            anagraficaBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
            anagraficaBtn.addActionListener(e -> showAnagraficaDetails(anagrafica));
            buttonPanel.add(anagraficaBtn);
        }
        
        JButton createBtn = new JButton("Crea Nuova Anagrafica");
        createBtn.addActionListener(e -> showCreateAnagraficaDialog());
        
        anagraficaListPanel.add(createBtn, BorderLayout.NORTH);
        anagraficaListPanel.add(new JScrollPane(buttonPanel), BorderLayout.CENTER);
        anagraficaListPanel.revalidate();
        anagraficaListPanel.repaint();
        
        ((CardLayout) mainPanel.getLayout()).show(mainPanel, "DETAILS");
        anagraficaManager.saveAnagrafiche();
    }
    
    private void showCreateAnagraficaDialog() {
        JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));
        JTextField nomeField = new JTextField();
        JTextField cognomeField = new JTextField();
        
        panel.add(new JLabel("Nome:"));
        panel.add(nomeField);
        panel.add(new JLabel("Cognome:"));
        panel.add(cognomeField);

        int result = JOptionPane.showConfirmDialog(this, panel, "Crea Nuova Anagrafica",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String nome = nomeField.getText();
            String cognome = cognomeField.getText();
            if (nome.trim().isEmpty() || cognome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nome e Cognome non possono essere vuoti.", "Errore", JOptionPane.ERROR_MESSAGE);
                return;
            }
            anagraficaManager.addAnagrafica(new Anagrafica(nome, cognome));
            refreshAnagraficaListPanel();
        }
    }
    
    private void showAnagraficaDetails(Anagrafica anagrafica) {
        // Aggiorna le etichette con i nuovi valori
        nomeLabelValue.setText(anagrafica.getNome());
        cognomeLabelValue.setText(anagrafica.getCognome());

        // Pulisci e ripopola il pannello dei campi personalizzati
        customPropertiesPanel.removeAll();
        for (Map.Entry<String, String> entry : anagrafica.getCustomProperties().entrySet()) {
            customPropertiesPanel.add(new JLabel(entry.getKey() + ":"));
            customPropertiesPanel.add(new JLabel(entry.getValue()));
        }
        customPropertiesPanel.revalidate();
        customPropertiesPanel.repaint();
        
        // Aggiorna le altre tab
        bankPanel.aggiornaConti(anagrafica);
        veicoliPanel.mostraVeicoli(anagrafica);
        
        // Mostra il pannello dei dettagli
        ((CardLayout) mainPanel.getLayout()).show(mainPanel, "DETAILS");
    }
}
