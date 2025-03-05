package com.mobiledevice;

public class MobileDeviceMain {
	
	public static void main(String [] args) {
		MobileDevice mb = new MobileDevice();
		mb.printDetails();
		System.out.println();
		mb.getBrand();
		mb.setBrand("Samsung");
		mb.getModel();
		mb.setModel("Galaxy S24 Ultra");
		mb.getCamera();
		mb.setCamera("200.0 MP + 50.0 MP + 12.0 MP + 10.0 MP");
		mb.getOS();
		mb.setOS("Android 14");
		mb.printDetails();
	}

}
