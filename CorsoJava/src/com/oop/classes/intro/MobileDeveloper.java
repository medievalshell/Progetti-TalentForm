package com.oop.classes.intro;

// EREDITARIETA'
public class MobileDeveloper extends HR {

	String technology;
	

	
	  // POLIMORFISMO
	public void utileTasse() {

		System.out.println(getUtileTasse());

	}

	public void totTassaInps() {

		System.out.println(getTassaInps());

	}

	public void totTassaIrpef() {

		System.out.println(getTassaIrpef());
	}

	public void totStipendioMensile() {

		System.out.println(getStipendioMensile());

	}

	public String getTechnology() {

		return technology;

	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

}
