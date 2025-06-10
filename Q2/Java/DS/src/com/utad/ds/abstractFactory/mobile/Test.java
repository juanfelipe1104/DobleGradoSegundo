package com.utad.ds.abstractFactory.mobile;

public class Test {
	public static void main(String[] args) {
		MobileFactoryManager factoryManager = MobileFactoryManager.getInstance();
		
		Mobile myIPhone = factoryManager.createIphone();
		Mobile mySamsung = factoryManager.createSamsung();
		Mobile myMoto = factoryManager.createMotorola();
		
		System.out.println("My Iphone available is "+myIPhone);
		
		System.out.println("My Samsung available is "+mySamsung);
		
		System.out.println("My Motorola available is "+myMoto);
		
		Mobile mySpanishMoto = factoryManager.createMotorola(Language.SPANISH.getIsoCode());
		
		System.out.println("Mi motorola español disponible es "+mySpanishMoto);
		
		factoryManager.setMobileFactory(new MobileFactory4G());
		
		Mobile myIPhone2 = factoryManager.createIphone();
		Mobile mySamsung2 = factoryManager.createSamsung();
		Mobile myMoto2 = factoryManager.createMotorola();
		Mobile mySpanishMoto2 = factoryManager.createMotorola(Language.SPANISH.getIsoCode());
		
		System.out.println("My Iphone2 available is "+myIPhone2);
		
		System.out.println("My Samsung2 available is "+mySamsung2);
		
		System.out.println("My Motorola2 available is "+myMoto2);
		
		System.out.println("Mi motorola2 español disponible es "+mySpanishMoto2);
	}
}
