package com.oop.classes.intro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AnagraficaManager implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Anagrafica> anagrafiche;
    private static final String FILE_NAME = "anagrafiche.ser";

    public AnagraficaManager() {
        this.anagrafiche = loadAnagrafiche();
    }

    public List<Anagrafica> getAnagrafiche() {
        return anagrafiche;
    }

    public void addAnagrafica(Anagrafica anagrafica) {
        anagrafiche.add(anagrafica);
        saveAnagrafiche();
    }

    public void removeAnagrafica(Anagrafica anagrafica) {
        anagrafiche.remove(anagrafica);
        saveAnagrafiche();
    }

    public void saveAnagrafiche() {
        System.out.println("DEBUG: Tentativo di salvataggio su file: " + new File(FILE_NAME).getAbsolutePath());
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(anagrafiche);
            System.out.println("DEBUG: Anagrafiche salvate con successo.");
        } catch (IOException e) {
            System.err.println("DEBUG: Errore durante il salvataggio.");
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    private List<Anagrafica> loadAnagrafiche() {
        File file = new File(FILE_NAME);
        System.out.println("DEBUG: Tentativo di caricamento da file: " + file.getAbsolutePath());
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                List<Anagrafica> loadedAnagrafiche = (List<Anagrafica>) ois.readObject();
                System.out.println("DEBUG: Anagrafiche caricate con successo.");
                return loadedAnagrafiche;
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("DEBUG: Errore durante il caricamento.");
                e.printStackTrace();
            }
        } else {
            System.out.println("DEBUG: File di salvataggio non trovato. Inizializzazione di una nuova lista.");
        }
        return new ArrayList<>();
    }
}
