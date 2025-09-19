package com.sintax;

public class Dipendente {

	private String matricola;
    private float stipendio;
    private float straordinario;
    
//    public Dipendente(String matricola, float stipendio, float straordinario) {
//        super();
//        this.matricola = matricola;
//        this.stipendio = stipendio;
//        this.straordinario = straordinario;
//    }

    public float getStipendio() {
        return stipendio;
    }
    
    public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public void setStipendio(float stipendio) {
		this.stipendio = stipendio;
	}

	public void setStraordinario(float straordinario) {
		this.straordinario = straordinario;
	}
    
    public float paga(int ore) {
        this.stipendio = ore * this.straordinario + this.stipendio;
        return this.stipendio;
    }

    public String stampa() {
        return "Dipendente [matricola=" + matricola + ", stipendio=" + stipendio + ", straordinario=" + straordinario
                + "]";
    }
    
    public static void main(String[] args) {
//        Dipendente dipendente = new Dipendente(
//            "001A",
//            1800f,
//            30
//        );
        
//        DipendenteA dipendenteA = new DipendenteA(
//            "001A",
//            1800f, 
//            30,
//            0
//        );
        DipendenteA dipendenteA = new DipendenteA();
        
        dipendenteA.setMalattia(5);
        dipendenteA.setMatricola("0001");
        dipendenteA.setStipendio(1000);
        dipendenteA.setStraordinario(15);
        
        dipendenteA.prendiMalattia(5);
        dipendenteA.stampaMalattia();
        System.out.println(dipendenteA.paga(15));
    }
    
}