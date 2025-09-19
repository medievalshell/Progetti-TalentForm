package com.OOP.SealedClasses.ExercicesSealedClasses;

public sealed class Smartphone permits Samsung, Iphone {

    public String getModel() {

        return "Brand";
    }

    public static void main(String[] args) {

        Smartphone s = new Smartphone();
        Smartphone sm = new Samsung();
        Smartphone ip = new Iphone();
        System.out.println(s.getModel());
        System.out.println(sm.getModel());
        System.out.println(ip.getModel());

    }


}


final class Samsung extends Smartphone {


    public String getModel() {

        return "Samsung S24";
    }


}


non-sealed class Iphone extends Smartphone {

    public String getModel() {

        return "Iphone 15";
    }


}

