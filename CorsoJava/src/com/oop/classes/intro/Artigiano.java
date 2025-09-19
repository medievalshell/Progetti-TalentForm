package com.oop.classes.intro;

public class Artigiano {

	static int redditoAnnuoLordo;
	static int coeffRedd;
	static int importoInps;
	static int aliquotaIrpef;

	static int getUtileTasse() {

		return redditoAnnuoLordo * coeffRedd / 100;

	}

	static int getTassaIrpef() {

		return getUtileTasse() * aliquotaIrpef / 100;

	}

	static int getRedditoNettoMensile() {

		return (redditoAnnuoLordo - (getTassaIrpef() + importoInps)) / 12;

	}

	public static void setRedditoAnnuoLordo(int redditoAnnuoLordo) {
		Artigiano.redditoAnnuoLordo = redditoAnnuoLordo;
	}

	public static void setCoeffRedd(int coeffRedd) {
		Artigiano.coeffRedd = coeffRedd;
	}

	public static void setImportoInps(int importoInps) {
		Artigiano.importoInps = importoInps;
	}

	public static void setAliquotaIrpef(int aliquotaIrpef) {
		Artigiano.aliquotaIrpef = aliquotaIrpef;
	}

}
