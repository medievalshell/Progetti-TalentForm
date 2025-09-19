package com.methods;

public class MainOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		ClassOverload overload = new ClassOverload();
		
		int lato1 = 3;
		int lato2 = 8;
		double lat1 = 23.45;
		double lat2= 14.23;
		float lt1 = 1.5f;
		float lt2 = 2.3f;
		
		System.out.println(overload.calcoloAreaRettangolo(lato1,lato2));
		System.out.println(overload.calcoloAreaRettangolo(lat1,lat2));
		System.out.println(overload.calcoloAreaRettangolo(lt1,lt2));

	}

}
