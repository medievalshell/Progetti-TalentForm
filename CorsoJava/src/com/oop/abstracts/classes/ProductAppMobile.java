package com.oop.abstracts.classes;

public class ProductAppMobile extends PreventivoAppMobile {
    private int rateOfDay;
    private int daysMockup;
    private int daysPublishingStores;
    private int daysDbOffline;
    private int daysMultilanguageApp;
    private String daysWaitingTimesApp;
    public ProductAppMobile(int rateOfDay, int daysMockup, int daysPublishingStores, int daysDbOffline,
            int daysMultilanguageApp, String daysWaitingTimesApp) {
        this.rateOfDay = rateOfDay;
        this.daysMockup = daysMockup;
        this.daysPublishingStores = daysPublishingStores;
        this.daysDbOffline = daysDbOffline;
        this.daysMultilanguageApp = daysMultilanguageApp;
        this.daysWaitingTimesApp = daysWaitingTimesApp;
    }
    @Override
    public int getDaysMockup() {
        return daysMockup;
    }
    @Override
    public int getDaysPublishingStores() {  
        return daysPublishingStores;
    }
    @Override
    public int getDaysDbOffline() {

        return daysDbOffline;
    }
    @Override
    public int getDaysMultilanguageApp() {  
        return daysMultilanguageApp;
    }
    @Override
    public String getDaysWaitingTimesApp() { 
        return daysWaitingTimesApp;
    }
    @Override
    public int getPriceMockup() {
        return rateOfDay*daysMockup;
    }
    @Override
    public int getPricePublishingStores() {   
        return rateOfDay*daysPublishingStores;
    }
    @Override
    public int getPriceDbOffline() {
        return rateOfDay*daysDbOffline;
    }
    @Override
    public int getPriceMultilanguageApp() {
        return rateOfDay*daysMultilanguageApp;
    }
    public int getPriceApp() {
        return getPriceMockup() + getPricePublishingStores() + getPriceDbOffline() + getPriceMultilanguageApp();
    }
}
