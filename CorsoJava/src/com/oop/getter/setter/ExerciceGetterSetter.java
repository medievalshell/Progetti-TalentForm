package com.oop.getter.setter;

public class ExerciceGetterSetter {
	
	// calcolare la retribuzione oraria in base al mio guadagno mensile	
    // giorni lavorati 20  ore lavorate 160 mensili
    // guadagno mensile 1600€


    private int hours;   // incapsulamento
    private int days;
    private int salHourly;
    private int salary;


    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public int getSalHourly() {

        return salHourly;
    }

    public void setSalHourly(int salHourly) {

        this.salHourly = salHourly;
    }

    public int getDays() {

        return days;

    }


    public void setDays
            (int days) {
        this.days = days;
    }

    public int getSalaryHourly() {


        return salary / salHourly;
    }


    public void setSalaryHourly(int salHourly) {

        this.salHourly = salHourly;
    }


    public static void main(String[] args) {


        ExerciceGetterSetter company = new ExerciceGetterSetter();


        company.setSalary(1750);
        company.setSalaryHourly(160);

        System.out.println(company.getSalaryHourly());


    }

}
