package com.utad.ds.abstractFactory.mobile;

public class MobileFactoryManager {
	private static MobileFactoryManager mobileFactoryManager = 
			new MobileFactoryManager(new MobileFactory3G());
	private AbstractMobileFactory mobileFactory;
	public static MobileFactoryManager getInstance() {
		return MobileFactoryManager.mobileFactoryManager;
	}
	private MobileFactoryManager(AbstractMobileFactory mobileFactory) {
		this.mobileFactory = mobileFactory;
	}
	public AbstractMobileFactory getMobileFactory() {
		return this.mobileFactory;
	}
	public void setMobileFactory(AbstractMobileFactory mobileFactory) {
		this.mobileFactory = mobileFactory;
	}
	public Mobile createSamsung() {
		return this.mobileFactory.createSamsung(); //Delegación por agregación
	}
	public Mobile createSamsung(String language) {
		return this.mobileFactory.createSamsung(language); //Delegación por agregación
	}
	public Mobile createIphone() {
		return this.mobileFactory.createIphone(); //Delegación por agregación
	}
	public Mobile createMotorola() {
		return this.mobileFactory.createMotorola();
	}
	public Mobile createMotorola(String language) {
		return this.mobileFactory.createMotorola(language);
	}
}
