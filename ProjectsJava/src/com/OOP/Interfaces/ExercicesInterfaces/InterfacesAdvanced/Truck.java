package com.OOP.Interfaces.ExercicesInterfaces.InterfacesAdvanced;

public class Truck implements Trackable {

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
}
