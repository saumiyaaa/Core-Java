package com.mobiledevice;

public class MobileDevice {
	
	private String brand;
	private String model;
	private String camera;
	private String OS;
	
	MobileDevice(){
		brand = "Apple";
		model = "iPhone 15";
		camera = "48MP - Main";
		OS = "iOS 17";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}
	
	public void printDetails() {
		System.out.println("Brand : "+brand);
		System.out.println("Model Name : "+model);
		System.out.println("Camera : "+camera);
		System.out.println("OS : "+OS);
	}
	
	

}
