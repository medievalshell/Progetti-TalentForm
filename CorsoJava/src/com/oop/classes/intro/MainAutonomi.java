package com.oop.classes.intro;

public class MainAutonomi {

	public static void main(String[] args) {

		HR hr = new HR();
		hr.setRedditoAnnuoLordo(85000);
		hr.setCoeffRedd(67);
		hr.setAliquotaInps(26);
		hr.setAliquotaIrpef(15);

		System.out.println(hr.getStipendioMensile());

		MobileDeveloper mobile = new MobileDeveloper();
		mobile.setRedditoAnnuoLordo(55000);
		mobile.setCoeffRedd(67);
		mobile.setAliquotaInps(26);
		mobile.setAliquotaIrpef(15);
		mobile.setTechnology("Flutter");

		System.out.println(mobile.getStipendioMensile()+"  " + mobile.getTechnology());

	}

}
