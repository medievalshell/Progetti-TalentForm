package com.oop.abstracts.classes;

//public class MainAppMobile extends PreventivoAppMobile {
	// PRIMA FASE
//	private String mockup;
//	private String googlePlay;
//	private String appleStore;
//	private String responsiveApp;
//	private String multiLanguages;
//	private String apiService;
//	private String waitingTimes;
//	private String waitingTimesTest;
//	private int giornateMockup;
//	private int giornateResponsiveApp;
//	private int giornatePubblicazioneApp;
//	private int giornateFunzioniGeneriche;
//	private int giornateDati;
//	private int tariffaGiornaliera;
//	@Override
//	public String getMockup() {
//		return mockup;
//	}
//	@Override
//	public String getGooglePlay() {
//		return googlePlay;
//	}
//	@Override
//	public String getAppleStore() {
//		return appleStore;
//	}
//	@Override
//	public String getMultiLanguages() {
//		return multiLanguages;
//	}
//	@Override
//	public String getResponsiveApp() {
//		return responsiveApp;
//	}
//	@Override
//	public String getApiService() {
//		return apiService;
//	}
//	@Override
//	public String getWaitingTimes() {
//		return waitingTimes;
//	}
//	@Override
//	public String getWaitingTimesTest() {
//		return waitingTimesTest;
//	}
//	public void setMockup(String mockup) {
//		this.mockup = mockup;
//	}
//	public void setGooglePlay(String googlePlay) {
//		this.googlePlay = googlePlay;
//	}
//	public void setAppleStore(String appleStore) {
//		this.appleStore = appleStore;
//	}
//	public void setResponsiveApp(String responsiveApp) {
//		this.responsiveApp = responsiveApp;
//	}
//	public void setApiService(String apiService) {
//		this.apiService = apiService;
//	}
//	public void setWaitingTimes(String waitingTimes) {
//		this.waitingTimes = waitingTimes;
//	}
//	public void setMultiLanguages(String multiLanguages) {
//		this.multiLanguages = multiLanguages;
//	}
//	public void setWaitingTimesTest(String waitingTimesTest) {
//		this.waitingTimesTest = waitingTimesTest;
//	}
	// SECONDA FASE
//	public void setGiornateMockup(int giornateMockup) {
//		this.giornateMockup = giornateMockup;
//	}
//	public void setGiornateResponsiveApp(int giornateResponsiveApp) {
//		this.giornateResponsiveApp = giornateResponsiveApp;
//	}
//	public void setGiornatePubblicazioneApp(int giornatePubblicazioneApp) {
//		this.giornatePubblicazioneApp = giornatePubblicazioneApp;
//	}
//	public void setGiornateFunzioniGeneriche(int giornateFunzioniGeneriche) {
//		this.giornateFunzioniGeneriche = giornateFunzioniGeneriche;
//	}
//	public void setGiornateDati(int giornateDati) {
//		this.giornateDati = giornateDati;
//	}
//	public void setTariffaGiornaliera(int tariffaGiornaliera) {
//		this.tariffaGiornaliera = tariffaGiornaliera;
//	}
	// 3 FASE
//	@Override
//	public int getPrezzoMockup() {
//		return tariffaGiornaliera*giornateMockup;
//	}
//	@Override
//	public int getPrezzoResponsiveApp() {
//		return tariffaGiornaliera*giornateResponsiveApp;
//	}
//	@Override
//	public int getPrezzoPubblicazioneApp() {
//		return tariffaGiornaliera*giornatePubblicazioneApp;
//	}
//	@Override
//	public int getPrezzoFunzioniGeneriche() {
//		return tariffaGiornaliera*giornateFunzioniGeneriche;
//	}
//	@Override
//	public int getPrezzoGestioneDati() {
//		return tariffaGiornaliera*giornateDati;
//	}
//	public int getTotalePreventivo() {
//		return getPrezzoMockup()+getPrezzoFunzioniGeneriche() + getPrezzoPubblicazioneApp()+ getPrezzoGestioneDati()+ getPrezzoResponsiveApp();
//	}
//	public static void main(String[] args) {
//		MainAppMobile mobile = new MainAppMobile();
		// PRIMA FASE
//		mobile.setMockup("Grafiche richieste per lo sviluppo del progetto mobile");
//		mobile.setGooglePlay(
//				"Il cliente dovrà fornire l'account aziendale per la pubblicazione nella versione Android");
//		mobile.setAppleStore(
//				"Il cliente dovra fornire i dati relativi all upload dell\'app su TestFlight e la pubblicazione su App Connect");
//		mobile.setResponsiveApp("L app mobile dovrà essere rilasciata per dispositi mobile-tablet-web");
//		mobile.setMultiLanguages("L'app dovrà essere disponibile in lingua italiano-inglese");
//		mobile.setApiService("Il servizio web principale dell app è : https:// api.service.maobile");
//		mobile.setWaitingTimesTest("La previsione della fase di test dell app si svolgerà in 5 giorni");
//		mobile.setWaitingTimes("La consegna prevista er il progetto mobile è di 90 giorni");
//		System.out.println(mobile.getMockup());
//		System.out.println(mobile.getGooglePlay());
//		System.out.println(mobile.getAppleStore());
//		System.out.println(mobile.getResponsiveApp());
//		System.out.println(mobile.getMultiLanguages());
//		System.out.println(mobile.getApiService());
//		System.out.println(mobile.getWaitingTimesTest());
//		System.out.println(mobile.getWaitingTimes());
		// SECONDA FASE
//		mobile.setGiornateMockup(7);
//		mobile.setGiornateResponsiveApp(7);
//		mobile.setGiornatePubblicazioneApp(2);
//		mobile.setGiornateFunzioniGeneriche(15);
//		mobile.setGiornateDati(10);
//		mobile.setTariffaGiornaliera(250);
//		System.out.println(mobile.getPrezzoMockup());
//		System.out.println(mobile.getPrezzoResponsiveApp());
//		System.out.println(mobile.getPrezzoPubblicazioneApp());
//		System.out.println(mobile.getPrezzoFunzioniGeneriche());
//		System.out.println(mobile.getPrezzoGestioneDati());
//		System.out.println("TOTALE PREVENTIVO APP MOBILE : €" + mobile.getTotalePreventivo());
//	}
//}

public class MainAppMobile {
    public static void main(String[] args) {
        ProductAppMobile app = new ProductAppMobile(250, 10, 20, 30, 40, "90 GIORNI");
        System.out.println("Il totale dell' app è di : €" + app.getPriceApp());
    }
}
