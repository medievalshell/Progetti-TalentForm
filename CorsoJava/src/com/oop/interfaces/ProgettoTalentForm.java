package com.oop.interfaces;

public class ProgettoTalentForm implements ISviluppoUIUX, ISviluppoBackend, ISviluppoMobile {

	private String ide;
	private String color;
	private String font;
	private String formatMockup;
	private String documentApi;
	private String technology;
	private String db;
	private String designPattern;
	private String apiService;
	private String apiServiceEndpoint;
	private String components;
	private String dependencies;
	private String releaseApp;
	private String testingApp;
	private boolean usingCleanArchitecture;

	@Override
	public String documentApi() {

		return documentApi;
	}

	@Override
	public String usingDB() {

		return db;
	}

	@Override
	public String usingDesignPattern() {

		return designPattern;
	}

	@Override
	public String usingTechnology() {

		return technology;
	}

	@Override
	public String apiService() {

		return apiService;
	}

	@Override
	public String apiServiceEndpoint() {

		return apiServiceEndpoint;
	}

	@Override
	public String usingComponents() {

		return components;
	}

	@Override
	public String usingDependencies() {

		return dependencies;
	}

	@Override
	public boolean usingCleanArchitecture() {

		return true;
	}

	@Override
	public String releaseApp() {

		return releaseApp;
	}

	@Override
	public String usingTestingApp() {

		return testingApp;
	}

	@Override
	public String usingIde() {

		return ide;
	}

	@Override
	public String usingColor() {

		return color;
	}

	@Override
	public String usingFont() {

		return font;
	}

	@Override
	public String formatMockup() {

		return formatMockup;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFont(String font) {
		this.font = font;
	}

	public void setFormatMockup(String formatMockup) {
		this.formatMockup = formatMockup;
	}

	public void setDocumentApi(String documentApi) {
		this.documentApi = documentApi;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public void setDesignPattern(String designPattern) {
		this.designPattern = designPattern;
	}

	public void setApiService(String apiService) {
		this.apiService = apiService;
	}

	public void setApiServiceEndpoint(String apiServiceEndpoint) {
		this.apiServiceEndpoint = apiServiceEndpoint;
	}

	public void setComponents(String components) {
		this.components = components;
	}

	public void setDependencies(String dependencies) {
		this.dependencies = dependencies;
	}

	public void setReleaseApp(String releaseApp) {
		this.releaseApp = releaseApp;
	}

	public void setTestingApp(String testingApp) {
		this.testingApp = testingApp;
	}

	public void setUsingCleanArchitecture(boolean usingCleanArchitecture) {
		this.usingCleanArchitecture = usingCleanArchitecture;
	}

	public static void main(String[] args) {

		ProgettoTalentForm uiux = new ProgettoTalentForm();

		uiux.setIde("Figma");
		uiux.setColor("Blue");
		uiux.setFont("Roboto");
		uiux.setFormatMockup(".pdf");

		System.out.println("Sviluppatore UIUX TASK MOCKUP :" + uiux.usingIde() 
		+ "  " + uiux.usingColor() + "  " + uiux.usingFont()
				+ " "+uiux.formatMockup());

		ProgettoTalentForm backend = new ProgettoTalentForm();

		backend.setIde("Eclipse");
		backend.setDocumentApi("Swagger");
		backend.setTechnology("Spring");
		backend.setApiService("https://api.service.talentform");
		backend.setApiServiceEndpoint("/home");
		backend.setDesignPattern("MVC");

		System.out.println("SVILUPPO BACKEND :" + backend.usingIde() 
		+ "  " + backend.documentApi() + "  " + backend.usingTechnology()
				+ " " + backend.apiService() + " " + backend.usingDesignPattern() 
				+ " " +  backend.apiServiceEndpoint());

		ProgettoTalentForm mobile = new ProgettoTalentForm();

		mobile.setIde("Android Studio");
		mobile.setTechnology("Flutter");
		mobile.setDependencies("Riverpod");
		mobile.setReleaseApp("Android-ioS");
		mobile.setTestingApp("Flutter Test");
		mobile.setComponents("Stateless Widget and StatefulWidget");
		mobile.setUsingCleanArchitecture(true);

		
		System.out.println("SVILUPPATORE MOBILE TASK :" + 
		mobile.usingIde()+ "  " + mobile.usingTechnology() + "  " + mobile.usingDependencies()
		+ "  " + mobile.releaseApp() + "  " +mobile.usingTestingApp()+ "  " + mobile.usingComponents()+"  " + mobile.usingCleanArchitecture());

	}

}
