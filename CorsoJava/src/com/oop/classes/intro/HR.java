package com.oop.classes.intro;

public class HR {
       
	
	// INCAPSULAMENTO
	private int redditoAnnuoLordo;
	private int coeffRedd;
	private int aliquotaInps;
	private int aliquotaIrpef;



	public int getUtileTasse() {
		return redditoAnnuoLordo * coeffRedd / 100;
	}

	public int getTassaInps() {
		return getUtileTasse()*aliquotaInps/100;
	}

	public int getTassaIrpef() {
		return getUtileTasse()*aliquotaIrpef/100;
	}

	public int getStipendioMensile() {
		return (redditoAnnuoLordo - (getTassaInps()+getTassaIrpef()))/12;
		
	}                               // INCAPSULAMENTO

	public void setRedditoAnnuoLordo(int redditoAnnuoLordo) {
		this.redditoAnnuoLordo = redditoAnnuoLordo;
	}

	public void setCoeffRedd(int coeffRedd) {
		this.coeffRedd = coeffRedd;
	}

	public void setAliquotaInps(int aliquotaInps) {
		this.aliquotaInps = aliquotaInps;
	}

	public void setAliquotaIrpef(int aliquotaIrpef) {
		this.aliquotaIrpef = aliquotaIrpef;
	}
	
	

}
